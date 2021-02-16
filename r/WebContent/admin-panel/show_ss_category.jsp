<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Sub Sub Category</title>

        <!-- Bootstrap core CSS -->

        <link href="css/bootstrap.min.css" rel="stylesheet">

        <link href="fonts/css/font-awesome.min.css" rel="stylesheet">
        <link href="css/animate.min.css" rel="stylesheet">

        <!-- Custom styling plus plugins -->
        <link href="css/custom.css" rel="stylesheet">
        <link href="css/icheck/flat/green.css" rel="stylesheet">

        <link rel="stylesheet" type="text/css" href="css/progressbar/bootstrap-progressbar-3.3.0.css">
        <script src="js/jquery.min.js"></script>

        <!--[if lt IE 9]>
              <script src="../assets/js/ie8-responsive-file-warning.js"></script>
              <![endif]-->

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
                <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
                <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
              <![endif]-->

    </head>


    <body class="nav-md">
        <div class="container body">
            <div class="main_container">

                <jsp:include page="include/sidebar.jsp"></jsp:include>

                <!-- top navigation -->
                <jsp:include page="include/header.jsp"></jsp:include>
                <!-- /top navigation -->

                <!-- page content -->
                <div class="right_col" role="main">

                    <div class=""> 
                        <div class="clearfix"></div>
                        <div class="">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>Add Sub-Category</h2>
                                        <ul class="nav navbar-right panel_toolbox">
                                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                            </li>
                                            <li class="dropdown">
                                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                                <ul class="dropdown-menu" role="menu">
                                                    <li><a href="#">Settings 1</a>
                                                    </li>
                                                    <li><a href="#">Settings 2</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                                            </li>
                                        </ul>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">
                                        <br />
                                        <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Add Sub Category <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input type="text" id="first-name" required="required" class="form-control col-md-7 col-xs-12">
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                                    <button type="submit" class="btn btn-primary">Cancel</button>
                                                    <button type="submit" class="btn btn-success">Submit</button>
                                                </div>
                                            </div>

                                        </form>
                                    </div>
                                </div>
                            </div>

                            <div class="col-md-6">

                            </div>

                            <!-- Start to do list -->
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>Show Sub-Category</h2>
                                        <div class="title_right">
                                            <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                                                <div class="input-group">
                                                    <input type="text" class="form-control" placeholder="Search">
                                                    <span class="input-group-btn">
                                                        <button class="btn btn-default" type="button">Go!</button>
                                                    </span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <table id="datatable-fixed-header" class="table table-striped table-bordered">
                                            <thead>
                                                <tr>
                                                    <th>SN</th>
                                                    <th>Category Name</th>
                                                    <th>Created On</th>
                                                    <th>Modified On</th>
                                                    <th>Action</th>
                                                </tr>
                                            </thead>


                                            <tbody>
                                                <tr>
                                                    <td>1</td>
                                                    <td>Male</td>
                                                    <td>2018/10/16 10:20:49</td>
                                                    <td>2011/04/25 04:09:06</td>
                                                    <td><div class="x_content">
                                                            <button type="button" class="btn btn-primary">Edit</button>
                                                            <button type="button" class="btn btn-success">Active</button>
                                                            <button type="button" class="btn btn-danger">Delete</button>
                                                        </div></td>
                                                </tr>
                                                <tr>
                                                    <td>2</td>
                                                    <td>Female</td>
                                                    <td>2018/10/16 10:20:49</td>  
                                                    <td>2011/07/25 12:23:03</td>
                                                    <td><div class="x_content">


                                                            <button type="button" class="btn btn-primary">Edit</button>
                                                            <button type="button" class="btn btn-success">Active</button>
                                                            <button type="button" class="btn btn-danger">Delete</button>
                                                        </div></td>



                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <!-- End to do list -->


                            <div class="col-md-6">

                            </div>

                        </div>
                        <div class="clearfix"></div>

                        <!-- footer content -->
                        <jsp:include page="include/footer.jsp"></jsp:include>
                        <!-- /footer content -->

                    </div>
                    
                </div>
                                            <!-- /page content -->
            </div>

            <div id="custom_notifications" class="custom-notifications dsp_none">
                <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
                </ul>
                <div class="clearfix"></div>
                <div id="notif-group" class="tabbed_notifications"></div>
            </div>

            <script src="js/bootstrap.min.js"></script>

            <!-- bootstrap progress js -->
            <script src="js/progressbar/bootstrap-progressbar.min.js"></script>
            <script src="js/nicescroll/jquery.nicescroll.min.js"></script>
            <!-- icheck -->
            <script src="js/icheck/icheck.min.js"></script>

            <script src="js/custom.js"></script>
            <!-- pace -->
            <script src="js/pace/pace.min.js"></script>
            <!-- PNotify -->
            <script type="text/javascript" src="js/notify/pnotify.core.js"></script>
            <script type="text/javascript" src="js/notify/pnotify.buttons.js"></script>
            <script type="text/javascript" src="js/notify/pnotify.nonblock.js"></script>

            <script>
                $(function () {
                    var cnt = 10; //$("#custom_notifications ul.notifications li").length + 1;
                    TabbedNotification = function (options) {
                        var message = "<div id='ntf" + cnt + "' class='text alert-" + options.type + "' style='display:none'><h2><i class='fa fa-bell'></i> " + options.title +
                                "</h2><div class='close'><a href='javascript:;' class='notification_close'><i class='fa fa-close'></i></a></div><p>" + options.text + "</p></div>";

                        if (document.getElementById('custom_notifications') == null) {
                            alert('doesnt exists');
                        } else {
                            $('#custom_notifications ul.notifications').append("<li><a id='ntlink" + cnt + "' class='alert-" + options.type + "' href='#ntf" + cnt + "'><i class='fa fa-bell animated shake'></i></a></li>");
                            $('#custom_notifications #notif-group').append(message);
                            cnt++;
                            CustomTabs(options);
                        }
                    }

                    CustomTabs = function (options) {
                        $('.tabbed_notifications > div').hide();
                        $('.tabbed_notifications > div:first-of-type').show();
                        $('#custom_notifications').removeClass('dsp_none');
                        $('.notifications a').click(function (e) {
                            e.preventDefault();
                            var $this = $(this),
                                    tabbed_notifications = '#' + $this.parents('.notifications').data('tabbed_notifications'),
                                    others = $this.closest('li').siblings().children('a'),
                                    target = $this.attr('href');
                            others.removeClass('active');
                            $this.addClass('active');
                            $(tabbed_notifications).children('div').hide();
                            $(target).show();
                        });
                    }

                    CustomTabs();

                    var tabid = idname = '';
                    $(document).on('click', '.notification_close', function (e) {
                        idname = $(this).parent().parent().attr("id");
                        tabid = idname.substr(-2);
                        $('#ntf' + tabid).remove();
                        $('#ntlink' + tabid).parent().remove();
                        $('.notifications a').first().addClass('active');
                        $('#notif-group div').first().css('display', 'block');
                    });
                })
            </script>
            <script type="text/javascript">
                var permanotice, tooltip, _alert;
                $(function () {
                    new PNotify({
                        title: "PNotify",
                        type: "dark",
                        text: "Welcome. Try hovering over me. You can click things behind me, because I'm non-blocking.",
                        nonblock: {
                            nonblock: true
                        },
                        before_close: function (PNotify) {
                            // You can access the notice's options with this. It is read only.
                            //PNotify.options.text;

                            // You can change the notice's options after the timer like this:
                            PNotify.update({
                                title: PNotify.options.title + " - Enjoy your Stay",
                                before_close: null
                            });
                            PNotify.queueRemove();
                            return false;
                        }
                    });

                });
            </script>
            <script>
                $(document).ready(function () {
                    $('.progress .bar').progressbar(); // bootstrap 2
                    $('.progress .progress-bar').progressbar(); // bootstrap 3
                });
            </script>

    </body>

</html>
