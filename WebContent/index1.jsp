<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>IMS </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <link rel="shortcut icon" type="image/x-icon" href="img/favicon.png">
    <!-- Place favicon.ico in the root directory -->

    <!-- CSS here -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/themify-icons.css">
    <link rel="stylesheet" href="css/nice-select.css">
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/gijgo.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/slick.css">
    <link rel="stylesheet" href="css/slicknav.css">
    <link rel="stylesheet" href="css/style.css">
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->
</head>

<body>
    
    <!-- header-start -->
    <header>
        <div class="header-area ">
            <div class="header-top_area d-none d-lg-block">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-5 col-md-5">
                            <div class="header_left">
                                <p>Welcome to Nalanda Institute Of Technology</p>
                            </div>
                        </div>
                        <div class="col-xl-7 col-md-7">
                            <div class="header_right d-flex">
                                    <div class="short_contact_list">
                                            <ul>
                                                <li><a href="#"> <i class="fa fa-envelope"></i>thenalanda.com</a></li>
                                                <li><a href="#"> <i class="fa fa-phone"></i> 1601-609 6780</a></li>
                                            </ul>
                                     </div>
                                        <div class="social_media_links">
                                            <a href="SignUp.html">
                                                <i class="fa fa-linkedin"></i>
                                            </a>
                                            <a href="SignUp.html">
                                                <i class="fa fa-facebook"></i>
                                            </a>
                                            <a href="SignUp.html">
                                                <i class="fa fa-google-plus"></i>
                                            </a>
                                        </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <div id="sticky-header" class="main-header-area">
                <div class="container">
                    <div class="header_bottom_border">
                        <div class="row align-items-center">
                            <div class="col-xl-3 col-lg-2">
                                <div class="logo">
                                    <a href="index1.jsp" style="color: white;">
                                        <img src="image/logo.png" height="70px" alt="not fount"> The Nalanda
                                    </a>
                                </div>
                            </div>
                            <div class="col-xl-6 col-lg-7">
                                <div class="main-menu  d-none d-lg-block">
                                    <nav>
                                        <ul id="navigation">
                                            <li><a class="active" href="index.html">Home</a></li>
                                            
                                             <li><a href="#">Department <i class="ti-angle-down"></i></a>
                                                <ul class="submenu">
                                                        <li><a href="mech.html">Mechanical Engineering</a></li>
                                                        <li><a href="civil.html">Civil Engineering</a></li>
                                                        <li><a href="electrical.html">Electrical Engineering</a></li>
                                                        <li><a href="cse.html">Computer Science Engineering</a></li>
                                                </ul>
                                            </li>
                                            <li><a href="http://www.thenalanda.com/photogallery.php">Gallery</a></li>
                                            
                                            <li><a href="contact.html">Contact</a></li>
                                            <li><a href="http://www.thenalanda.com/page.php?page=about-us">About Us</a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                            <div class="col-xl-3 col-lg-3 d-none d-lg-block">
                                <div class="Appointment">
                                    <%String regno=(String)session.getAttribute("regno");%>
                                    
                                    <%if(regno!=null) {%>
                                            <%%>
                                       <%if(regno.equals("111")){ %>
                                             <a href="LibreryAdminDashBoard.html"><img alt="not found" src="image/user1.png" width="30%"></a>
                                       <%} %>
                                       
                                       <%if(regno.equals("222")){ %>
                                       
                                             <a href="AccountAdminDashboard.html"><img alt="not found" src="image/user1.png" width="30%"></a>
                                       <%} %>
                                       
                                        <a href="StudentDashBoard.html"><img alt="not found" src="image/user1.png" width="30%"></a>
                                    <%}else { %>
                                    
                                    <a href="signin.html"><img alt="not found" src="image/user1.png" width="30%"></a>
                                    
                                    <% }%>
                                     
                                </div>
                            </div>
                            <div class="col-12">
                                <div class="mobile_menu d-block d-lg-none"></div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </header>
    <!-- header-end -->

    <!-- slider_area_start -->
    <div class="slider_area">
        <div class="slider_active owl-carousel">
            <div class="single_slider  d-flex align-items-center slider_bg_1 overlay2">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-12">
                            <div class="slider_text ">
                                <h3>Big Opportunity <br>
                                        for your Study</h3>
                                <div class="video_service_btn">
                                    <a href="signin.html" class="boxed-btn3">signin/signup</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="single_slider  d-flex align-items-center slider_bg_2 overlay2">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-12">
                            <div class="slider_text ">
                                <h3>Big Opportunity <br>
                                        for your Carrier</h3>
                                <div class="video_service_btn">
                                    <a href="#" class="boxed-btn3">signin/signup</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="single_slider  d-flex align-items-center slider_bg_1 overlay2">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-12">
                            <div class="slider_text ">
                                <h3>Big Opportunity <br>
                                        for your Life</h3>
                                <div class="video_service_btn">
                                    <a href="#" class="boxed-btn3">signin/signup</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- slider_area_end -->

    <!-- service_area_start -->
    <div class="service_area">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="section_title text-center mb-50">
                        <h3>What we provides</h3>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="single_service text-center">
                        <div class="service_icon">
                            <img src="img/svg_icon/1.svg" alt="">
                        </div>
                        <h3>Hostel facilities </h3>
                       <p>For your child safety</p>
                       
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="single_service text-center">
                        <div class="service_icon">
                            <img src="img/svg_icon/2.svg" alt="">
                        </div>
                        <h3>Bus facilities</h3>
                        <p>No problem in travelling</p>
                       
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="single_service text-center">
                        <div class="service_icon">
                            <img src="img/svg_icon/3.svg" alt="">
                        </div>
                        <h3>Outing Facilities</h3>
                        <p>Refreshment for your child</p>
                        
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="single_service text-center">
                        <div class="service_icon">
                            <img src="img/svg_icon/4.svg" alt="">
                        </div>
                        <h3>Sports and Gym facilities</h3>
                        <p>For better growth & better health</p>
                        
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="single_service text-center">
                        <div class="service_icon">
                            <img src="img/svg_icon/5.svg" alt="">
                        </div>
                        <h3>Cantten facilities</h3>
                        <p>For better study food is necessary.</p>
                        
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="single_service text-center">
                        <div class="service_icon">
                            <img src="img/svg_icon/6.svg" alt="">
                        </div>
                        <h3>Good facualties</h3>
                        <p>For guide your child</p>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- service_area_end -->

    <!-- about_info_area start  -->
    <div class="about_info_area">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-xl-6 col-lg-6">
                    <div class="about_text">
                        <h3>Why you jonning with us?</h3>
                        <p>This state of the art institute is laid out in over 32 acres at Chandaka square, 
                        Bhubaneswar and approved by AICTE, New Delhi, affiliated to BPUT & recognized by Govt. of Orissa</p>
                            <a href="#" class="boxed-btn3">About Us</a>
                    </div>
                </div>
                <div class="col-xl-6 col-lg-6">
                    <div class="about_thumb">
                        <img src="img/service/about.png" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /about_info_area end  -->

    
    <!-- team_area  -->
    <div class="team_area">
            <div class="container">
                <div class="border_bottom">
                    <div class="row">
                        <div class="col-xl-12">
                            <div class="section_title mb-40 text-center">
                                <h3>
                                        Expert Team
                                </h3>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xl-4 col-lg-4 col-md-6">
                            <div class="single_team">
                                <div class="team_thumb">
                                    <img src="img/team/3.png" alt="">
                                </div>
                                <div class="team_info text-center">
                                    <h3>Milani Mou</h3>
                                    <p>Photographer</p>
                                    <div class="social_link">
                                        <ul>
                                            <li><a href="#">
                                                    <i class="fa fa-facebook"></i>
                                                </a>
                                            </li>
                                            <li><a href="#">
                                                    <i class="fa fa-twitter"></i>
                                                </a>
                                            </li>
                                            <li><a href="#">
                                                    <i class="fa fa-instagram"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6">
                            <div class="single_team">
                                <div class="team_thumb">
                                    <img src="img/team/2.png" alt="">
                                </div>
                                <div class="team_info text-center">
                                    <h3>Jasmine Pinky</h3>
                                    <p>Photographer</p>
                                    <div class="social_link">
                                        <ul>
                                            <li><a href="#">
                                                    <i class="fa fa-facebook"></i>
                                                </a>
                                            </li>
                                            <li><a href="#">
                                                    <i class="fa fa-twitter"></i>
                                                </a>
                                            </li>
                                            <li><a href="#">
                                                    <i class="fa fa-instagram"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6">
                            <div class="single_team">
                                <div class="team_thumb">
                                    <img src="img/team/1.png" alt="">
                                </div>
                                <div class="team_info text-center">
                                    <h3>Piya Zosoldos</h3>
                                    <p>Photographer</p>
                                    <div class="social_link">
                                        <ul>
                                            <li><a href="#">
                                                    <i class="fa fa-facebook"></i>
                                                </a>
                                            </li>
                                            <li><a href="#">
                                                    <i class="fa fa-twitter"></i>
                                                </a>
                                            </li>
                                            <li><a href="#">
                                                    <i class="fa fa-instagram"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <!-- /team_area  -->

    <!-- Information_area  -->
    <div class="Information_area overlay">
        <div class="container">
            <div class="row justify-content-center align-items-center">
                <div class="col-xl-8">
                    <div class="info_text text-center">
                        <h3>For Any Information Call Us</h3>
                        <p>Live as if you were to die tomorrow. Learn as if you were to live forever.</p>
                        <p>Anytime you contact 24X7</p>
                        <a class="boxed-btn3" href="#">+10 673 763 6786</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /Information_area  end -->

    <!-- footer start -->
    <footer class="footer">
        <div class="footer_top">
            <div class="container">
                <div class="row">
                    <div class="col-xl-3 col-md-6 col-lg-3">
                        <div class="footer_widget">
                            <div class="footer_logo">
                                <a href="#">
                                    <img src="image/logo.png" alt="" height="89px">
                                </a>
                            </div>
                            <p>
                                   <a href="#">thenalanda.com</a> <br>
                                        +10 873 672 6782 <br>
                                        Nalanda Insitute Of Technology <br>
                                        Nayapali <br>
                                        756010.
                            </p>
                            <div class="socail_links">
                                <ul>
                                    <li>
                                        <a href="#">
                                            <i class="ti-facebook"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="ti-twitter-alt"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-instagram"></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>

                        </div>
                    </div>
                    <div class="col-xl-2 col-md-6 col-lg-3">
                        <div class="footer_widget">
                            <h3 class="footer_title">
                                    Services
                            </h3>
                            <ul>
                                <li><a href="#">Hostel Facilities</a></li>
                                <li><a href="#">Cantten Facilities</a></li>
                                <li><a href="#">Bus Facilities</li>
                                <li><a href="#">Sports & Gym Facilities</a></li>
                            </ul>

                        </div>
                    </div>
                    <div class="col-xl-2 col-md-6 col-lg-2">
                        <div class="footer_widget">
                            <h3 class="footer_title">
                                    Useful Links
                            </h3>
                            <ul>
                                <li><a href="http://www.thenalanda.com/page.php?page=about-us">About</a></li>
                                <li><a href="http://www.bput.ac.in/"> www.bput.ac.in</a></li>
                                <li><a href="http://www.thenalanda.com/index.php"> www.thenalanda.com</a></li>
                            </ul>
                        </div>
                    </div>
                   
                </div>
            </div>
        </div>
        <div class="copy-right_text">
            <div class="container">
                <div class="footer_border"></div>
                <div class="row">
                    <div class="col-xl-12">
                        <p class="copy_right text-center">
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved |
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!--/ footer end  -->

    <!-- link that opens popup -->


    <!-- JS here -->
    <script src="js/vendor/modernizr-3.5.0.min.js"></script>
    <script src="js/vendor/jquery-1.12.4.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/isotope.pkgd.min.js"></script>
    <script src="js/ajax-form.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <script src="js/imagesloaded.pkgd.min.js"></script>
    <script src="js/scrollIt.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/wow.min.js"></script>
    <script src="js/nice-select.min.js"></script>
    <script src="js/jquery.slicknav.min.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/plugins.js"></script>
    <script src="js/gijgo.min.js"></script>
    <script src="js/slick.min.js"></script>
    <!--contact js-->
    <script src="js/contact.js"></script>
    <script src="js/jquery.ajaxchimp.min.js"></script>
    <script src="js/jquery.form.js"></script>
    <script src="js/jquery.validate.min.js"></script>
    <script src="js/mail-script.js"></script>

    <script src="js/main.js"></script>
</body>

</html>