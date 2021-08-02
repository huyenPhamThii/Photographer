<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- saved from url=(0043)http://us-123photo.simplesite.com/420329500 -->
<html lang="en-US" class=""><head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body data-pid="420329500" data-iid="">

        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <jsp:include page="../component/Header.jsp"></jsp:include> <!-- this is the Header content -->

                <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
                    <div class="container">
                        <div class="row-fluid content-inner">
                            <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                                <h2>${error}</h2>
                        </div>
                        <jsp:include page="../component/Right.jsp"/>
                    </div>        
                </div>
            </div>  <!-- the controller has determined which view to be shown in the content -->

            <jsp:include page="../component/Footer.jsp"></jsp:include>  <!-- this is the Footer content -->
        </div>

        <input type="hidden" id="anti-forgery-token" value="vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5XDrvUyMasUYb8PZlmgROpWgWhFTGjCoyYPRNAZ57HUVr4c6QnvYhoYJLJG8dWLP2NhmdVJF+RhKEwkT1Q7ogGGTSddnANm69E10QsexY3DV5L0XqDr1VHHaGc7ZSxM2ktc82EJ4KYkwEXssuv2a0gNK9Zc8XKu5Ft28qiKVqNsj3YTpteTqb5UM9+U6Dtk4R+nJWQ1rw7NgjMDh9hCABmCHxgiQJBhPooojs3CleKjorvDjhc1vLhNfhEdOaEJSAXy1zHip7yoxj/Ybn86swSis7wnW/YTVdMos5ci15FQjTeolT8Jz57u/FccnoChNvFNIbeWFg3w+bqj4mEcQ8kwXboEr6bINuLYCT9vAwB3KWSKoxbUuugrKiDkmrTyw7A==">
        
    </body>
</html>