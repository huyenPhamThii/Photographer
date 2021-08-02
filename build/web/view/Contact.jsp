<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- saved from url=(0043)http://us-123photo.simplesite.com/420329500 -->
<html lang="en-US" class=""><head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body data-pid="420329500" data-iid="">


        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <jsp:include page="../component/Header.jsp"></jsp:include>

                <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
                    <div class="container">
                        <div class="row-fluid content-inner">
                            <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                                <div class="wrapper map-page">
                                    <div class="heading">
                                        <h1 class="page-title">Contact</h1>
                                    </div>

                                    <div class="content">
                                        <div class="section">
                                            <div class="content">

                                                <div class="row-fluid map-page-info">
                                                    <div class="span6">
                                                        <div class="item">
                                                            <div class="heading">
                                                                <h4 class="item-title map-page-title">PHOTOGRAPHER</h4>
                                                            </div>
                                                            <div class="content">
                                                                <div class="country">
                                                                    <p>Address: ${contact.getAdrress()}<br>City: ${contact.getCity()}<br>Country: ${contact.getCountry()}</p>
                                                            </div>

                                                            <div class="row-fluid">
                                                                <div class="span2">
                                                                    Tel:
                                                                </div>    
                                                                <div class="span10">
                                                                    ${contact.getPhone()}
                                                                </div>    
                                                            </div>
                                                            <div class="row-fluid">
                                                                <div class="span2">
                                                                    Email:
                                                                </div>    
                                                                <div class="span10">
                                                                    ${contact.getEmail()}
                                                                </div>    
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="span6">
                                                    <div class="item">
                                                        <div class="heading">
                                                            <h4 class="item-title map-page-title"></h4>
                                                        </div>
                                                        <div class="content">

                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="map">
                                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.458650859533!2d105.52420231540215!3d21.014326593645716!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2zxJDhuqFpIGjhu41jIEZQVA!5e0!3m2!1svi!2s!4v1585369141317!5m2!1svi!2s" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>

                                    </div>
                                </div>
                            </div>
                        </div>
                        <jsp:include page="../component/Right.jsp"/>
                    </div>        
                </div>
            </div>  <!-- the controller has determined which view to be shown in the content -->

            <jsp:include page="../component/Footer.jsp"></jsp:include>< <!-- this is the Footer content -->
        </div>


        <input type="hidden" id="anti-forgery-token" value="vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5XDrvUyMasUYb8PZlmgROpWgWhFTGjCoyYPRNAZ57HUVr4c6QnvYhoYJLJG8dWLP2NhmdVJF+RhKEwkT1Q7ogGGTSddnANm69E10QsexY3DV5L0XqDr1VHHaGc7ZSxM2ktc82EJ4KYkwEXssuv2a0gNK9Zc8XKu5Ft28qiKVqNsj3YTpteTqb5UM9+U6Dtk4R+nJWQ1rw7NgjMDh9hCABmCHxgiQJBhPooojs3CleKjorvDjhc1vLhNfhEdOaEJSAXy1zHip7yoxj/Ybn86swSis7wnW/YTVdMos5ci15FQjTeolT8Jz57u/FccnoChNvFNIbeWFg3w+bqj4mEcQ8kwXboEr6bINuLYCT9vAwB3KWSKoxbUuugrKiDkmrTyw7A==">


        </body>
</html>