<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- saved from url=(0034)http://us-123photo.simplesite.com/ -->
<html lang="en-US" class=""><head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body data-pid="410915065" data-iid="">
        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->

            <jsp:include page="../component/Header.jsp"></jsp:include> <!-- this is the Header content -->

                <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
                    <div class="container">
                        <div class="row-fluid content-inner">
                            <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                                <div class="wrapper ">
                                    <div class="content">

                                        <div class="section article">
                                            <div class="content">
                                                <div class="img-simple span12 ">
                                                    <div class="image">
                                                        <a rel="nofollow" data-ss="imagemodal"><img src="images/${authorInfor.getImg()}"></a>
                                                </div>
                                                <div class="image-caption">
                                                    <p class="sub2">${authorInfor.getShortDes()}</p> 
                                                </div> 
                                            </div>
                                        </div>
                                    </div>

                                    <!--Start of gallery list-->
                                    <div class="section">
                                        <div class="content">
                                            <ul class="thumbnails column-article-section">
                                                <c:forEach var="t" items="${galleryPagingList}">
                                                    <li class="span4">
                                                        <div class="img-simple span12 ">
                                                            <div class="imageGallery">
                                                                <a rel="nofollow" data-ss="imagemodal" href="gallery?galleryID=${t.getId()}"> <img src="images/${t.getImg()}" style="float: left; width: 100%; height: 150px; object-fit: cover; "></a>
                                                            </div>
                                                        </div>

                                                        <h4>
                                                            <a rel="nofollow" href="gallery?galleryID=${t.getId()}">View ${t.getTitle()}</a>
                                                        </h4>
                                                        <p>${t.getBrief()}</p>
                                                    </li>
                                                </c:forEach>
                                            </ul>
                                        </div>
                                    </div>
                                    <!--End of gallery list-->

                                    <!--Start of paging-->
                                    <div style="margin-left: 50%" class="paging">
                                        <c:forEach begin="1" end="${pageNumber}" var="i">
                                            <a class="${i == pageIndex ? "active" : ""}" href="home?pageIndex=${i}">${i}</a>
                                        </c:forEach>
                                    </div>
                                    <!--End of paging-->

                                    <div class="section article">
                                        <div class="heading">
                                            <h3>About me</h3>
                                        </div>

                                        <div class="content">
                                            <p><span>${authorInfor.getAbout()}</span></p>    </div>
                                    </div>
                                </div>


                            </div>
                        </div>
                        <jsp:include page="../component/Right.jsp"/>
                    </div>        
                </div>
            </div>  <!-- the controller has determined which view to be shown in the content -->

            <jsp:include page="../component/Footer.jsp"></jsp:include>  <!-- this is the Footer content -->
        </div>

    </body>
</html>