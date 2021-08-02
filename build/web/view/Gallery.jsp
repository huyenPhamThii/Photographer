<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- saved from url=(0043)http://us-123photo.simplesite.com/410915248 -->
<html lang="en-US" class="">
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="js/script.js"></script>
    </head>
    <body data-pid="410915248" data-iid="">


        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <jsp:include page="../component/Header.jsp"></jsp:include>  <!-- this is the Header content -->

                <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
                    <div class="container">
                        <div class="row-fluid content-inner">
                            <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                                <div class="wrapper photo-album photo-album-exhibition">
                                    <div class="content"> 
                                        <!-- Start of slide show -->
                                        <div class="section">
                                            <div class="section">
                                                <div id="slides-wapper" class="content">
                                                    <ul id="slides">
                                                        <li  class="slide-show">
                                                            <img width="700px" height="425px" src="images/${slideAlbumList.get(0).getImg()}"/>
                                                    </li>
                                                    <c:forEach items="${slideAlbumList}" var="i" begin="0" end="${slideAlbumList.size()}">
                                                        <li class="slide">
                                                            <img width="700px" height="425px" src="images/${i.getImg()}"/>
                                                        </li>
                                                    </c:forEach>
                                                    <button id="btn-control" onclick="controlButton()"> 
                                                        <img id="img-control"  src="images/pause.png"/>
                                                    </button>
                                                </ul>

                                            </div>
                                        </div>
                                    </div>
                                    <!-- End of slide show -->

                                    <!--Start of small album-->

                                    <div class="section"> 
                                        <div class="content" style="margin-bottom: 100px">
                                            <c:forEach begin="1" end="${lineNumber}" var="i">                                                    
                                                <ul class="thumbnails" data-ss="">
                                                    <c:forEach items="${paginationAlbumList}" begin="${i*4-4}" end="${i*4-1}" var="j">
                                                        <li class="span3">
                                                            <div>
                                                                <div class="thumbnail">;
                                                                    <a rel="nofollow"><img src="images/${j.getImg()}"></a>
                                                                </div>
                                                            </div>
                                                        </li>
                                                    </c:forEach>
                                                </ul>
                                            </c:forEach>
                                        </div>
                                    </div>
                                    <!--End of small album-->

                                    <!--Start of paging-->
                                    <div style="margin-left: 50%" class="paging">
                                        <c:forEach begin="1" end="${pageNumber}" var="i">
                                            <a class="${i == pageIndex ? "active" : ""}" href="gallery?pageIndex=${i}&galleryID=${galleryID}">${i}</a>
                                        </c:forEach>
                                    </div>
                                    <!--End of paging-->
                                </div>

                            </div>
                        </div>
                        <jsp:include page="../component/Right.jsp"/>
                    </div>        
                </div>
            </div>  <!-- the controller has determined which view to be shown in the content -->

            <jsp:include page="../component/Footer.jsp"></jsp:include>  <!-- this is the Footer content -->
        </div>


        <input type="hidden" id="anti-forgery-token" value="vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5XDrvUyMasUYb8PZlmgROpWgWhFTGjCoyYPRNAZ57HUVr4c6QnvYhoYJLJG8dWLP2NhmdVJF+RhKEwkT1Q7ogGGTSddnANm69E10QsexY3DV5L0XqDr1VHHaGc7ZSxM2ktc82EJ4KYkwEXssuv2a0gNK9Zc8XKu5Ft28qiKVqNsj3YTpteTqb5UM9+U6Dtk4R+nJWQ1rw7NgjMDh9hCABmCHxgiQJBhPooojs3CleKjorvDjhc1vLhNfhEdOaEJSAXy1zHip7yoxj/Ybn86swSis7wnW/YTVdMos5ci15FQjTeolT8Jz57u/FccnoChNvE6mgDNYAuAiuPkAPFrltn8Jw0BGrPWi2hzMvZ18t6D5jGd441UVkKxcackgBiYs+A==">


    </body>
</html>