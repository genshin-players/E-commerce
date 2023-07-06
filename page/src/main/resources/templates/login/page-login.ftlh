<!DOCTYPE html>
<html lang="en" class="h-100">

<head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="keywords" content="">
	<meta name="author" content="">
	<meta name="robots" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Innap : Hotel Admin Template">

	<!-- PAGE TITLE HERE -->
	<title>Innap : Hotel Admin Template</title>

    <link href="css/style.css" rel="stylesheet">

</head>

<body class="vh-100">
    <div class="authincation h-100">
        <div class="container h-100">
            <div class="row justify-content-center h-100 align-items-center">
                <div class="col-md-6">
                    <div class="authincation-content">
                        <div class="row no-gutters">
                            <div class="col-xl-12">
                                <div class="auth-form">
									<div class="text-center mb-3">
										<a href="index.html"><img src="https://www.17sucai.com/preview/1097306/2021-07-20/xhtml/images/logo-full.png" alt=""></a>
									</div>
                                    <h4 class="text-center mb-4">Sign in your account</h4>
                                    <form action="http://localhost:8003/user/register" method="post">
                                        <div class="mb-3">
                                            <label class="mb-1"><strong>登录用户名</strong></label>
                                            <input type="text" class="form-control" value="hello@example.com" name="loginName" required>
                                        </div>
                                        <div class="mb-3">
                                            <label class="mb-1"><strong>密码</strong></label>
                                            <input type="password" class="form-control" value="Password" name="password" required>
                                        </div>
                                        <div class="mb-3">
                                            <label class="mb-1"><strong>真实姓名</strong></label>
                                            <input type="text" class="form-control" value="Password" name="userName" pattern="^[\u4e00-\u9fa5]+$" required>
                                        </div>

                                        <div class="mb-3">
                                            <label class="mb-1"><strong>性别</strong></label>
                                            <td>
                                                <input type="radio"   name="gender"  value="1" checked="checked"> 男
                                                <input type="radio"   name="gender"  value="0" > 女
                                            </td>

                                        </div>

                                        <div class="mb-3">
                                            <label class="mb-1"><strong>邮箱</strong></label>
                                            <input type="text" class="form-control" title="请输入正确的邮箱" name="email" pattern="^\w+@\w+(\.\w+){1,2}$" required>
                                        </div>

                                        <div class="mb-3">
                                            <label class="mb-1"><strong>手机</strong></label>
                                            <input type="text" class="form-control" title="请输入正确的手机" name="mobile" pattern="^(11|15|18)\d{9}$" required>
                                        </div>

                                        <div class="row d-flex justify-content-between mt-4 mb-2">
                                            <div class="mb-3">
                                               <div class="form-check custom-checkbox ms-1">
													<input type="checkbox" class="form-check-input" id="basic_checkbox_1">
													<label class="form-check-label" for="basic_checkbox_1">Remember my preference</label>
												</div>
                                            </div>
                                            <div class="mb-3">
                                                <a href="javascript:;">Forgot Password?</a>
                                            </div>
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" class="btn btn-primary btn-block">Sign Me In</button>
                                        </div>
                                    </form>
                                    <div class="new-account mt-3">
                                        <p>Don't have an account? <a class="text-primary" href="page-register.html">Sign up</a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!--**********************************
        Scripts
    ***********************************-->
    <!-- Required vendors -->
    <script src="js/global.min.js"></script>
    <script src="js/custom.min.js"></script>
    <script src="js/deznav-init.js"></script>
	<script src="js/styleSwitcher.js"></script>
</body>
</html>
