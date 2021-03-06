USE [master]
GO
/****** Object:  Database [Photographer]    Script Date: 7/2/2021 2:03:40 PM ******/
CREATE DATABASE [Photographer]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Photographer', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Photographer.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Photographer_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Photographer_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Photographer] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Photographer].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Photographer] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Photographer] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Photographer] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Photographer] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Photographer] SET ARITHABORT OFF 
GO
ALTER DATABASE [Photographer] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Photographer] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Photographer] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Photographer] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Photographer] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Photographer] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Photographer] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Photographer] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Photographer] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Photographer] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Photographer] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Photographer] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Photographer] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Photographer] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Photographer] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Photographer] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Photographer] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Photographer] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Photographer] SET  MULTI_USER 
GO
ALTER DATABASE [Photographer] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Photographer] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Photographer] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Photographer] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Photographer] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Photographer] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [Photographer] SET QUERY_STORE = OFF
GO
USE [Photographer]
GO
/****** Object:  Table [dbo].[Album]    Script Date: 7/2/2021 2:03:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Album](
	[galleryID] [int] NOT NULL,
	[img] [varchar](50) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Author]    Script Date: 7/2/2021 2:03:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Author](
	[img] [varchar](50) NULL,
	[shortDesc] [varchar](max) NULL,
	[about] [varchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Contact]    Script Date: 7/2/2021 2:03:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contact](
	[addr] [varchar](max) NOT NULL,
	[city] [varchar](50) NOT NULL,
	[country] [varchar](50) NOT NULL,
	[phone] [varchar](50) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[facebookURL] [varchar](50) NOT NULL,
	[googleURL] [varchar](50) NOT NULL,
	[twitterURL] [varchar](50) NOT NULL,
	[facebookImg] [varchar](50) NOT NULL,
	[googleImg] [varchar](50) NOT NULL,
	[twitterImg] [varchar](50) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Gallery]    Script Date: 7/2/2021 2:03:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Gallery](
	[id] [int] NOT NULL,
	[title] [varchar](50) NULL,
	[img] [varchar](50) NULL,
	[brief] [varchar](max) NULL,
	[createdDate] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[View]    Script Date: 7/2/2021 2:03:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[View](
	[photographerView] [int] NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (1, N'a5.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (1, N'a2.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (1, N'a3.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (1, N'a4.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (1, N'cat2.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (1, N'a7.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (1, N'a8.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (1, N'a1.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (2, N'a5.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (2, N'a6.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (2, N'a7.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (2, N'a3.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (2, N'a2.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (2, N'a1.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (2, N'a4.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (3, N'a6.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (3, N'a7.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (3, N'a8.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (4, N'a1.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (4, N'a2.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (4, N'a6.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (4, N'a3.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (5, N'a2.jpg')
INSERT [dbo].[Album] ([galleryID], [img]) VALUES (5, N'a3.jpg')
GO
INSERT [dbo].[Author] ([img], [shortDesc], [about]) VALUES (N'me.jpg', N'Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim')
GO
INSERT [dbo].[Contact] ([addr], [city], [country], [phone], [email], [facebookURL], [googleURL], [twitterURL], [facebookImg], [googleImg], [twitterImg]) VALUES (N'Thach That', N'Ha Noi', N'Viet Nam', N'0123654879', N'huyenpt20@gmail.com', N'https://www.facebook.com/', N'https://www.google.com/', N'https://twitter.com/', N'facebookIcon.png', N'googleIcon.png', N'twitterIcon.png')
GO
INSERT [dbo].[Gallery] ([id], [title], [img], [brief], [createdDate]) VALUES (1, N'Gallery1', N'a1.jpg', N'Nikos was an ordinary man. One thing that he did not believe in was superstition. But when so many things that are meant to cause bad luck started bringing him good luck, he began to wonder …

', CAST(N'2000-01-01' AS Date))
INSERT [dbo].[Gallery] ([id], [title], [img], [brief], [createdDate]) VALUES (2, N'Gallery2', N'a5.jpg', N'Nikos was an ordinary man. One thing that he did not believe in was superstition. But when so many things that are meant to cause bad luck started bringing him good luck, he began to wonder …

', CAST(N'2001-01-01' AS Date))
INSERT [dbo].[Gallery] ([id], [title], [img], [brief], [createdDate]) VALUES (3, N'Gallerry3', N'a6.jpg', N'Nikos was an ordinary man. One thing that he did not believe in was superstition. But when so many things that are meant to cause bad luck started bringing him good luck, he began to wonder …

', CAST(N'2002-01-01' AS Date))
INSERT [dbo].[Gallery] ([id], [title], [img], [brief], [createdDate]) VALUES (4, N'Gallery4', N'a1.jpg', N'Nikos was an ordinary man. One thing that he did not believe in was superstition. But when so many things that are meant to cause bad luck started bringing him good luck, he began to wonder …

', CAST(N'2003-01-01' AS Date))
INSERT [dbo].[Gallery] ([id], [title], [img], [brief], [createdDate]) VALUES (5, N'Gallerry5', N'a2.jpg', N'Nikos was an ordinary man. One thing that he did not believe in was superstition. But when so many things that are meant to cause bad luck started bringing him good luck, he began to wonder …

', CAST(N'2004-01-01' AS Date))
GO
INSERT [dbo].[View] ([photographerView]) VALUES (182)
GO
USE [master]
GO
ALTER DATABASE [Photographer] SET  READ_WRITE 
GO
