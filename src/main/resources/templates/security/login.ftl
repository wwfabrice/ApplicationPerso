<#import "/spring.ftl" as spring/>
<title>A RENSEIGNER</title>
<!--<link rel="icon" type="image/png" href="img/favicon.png"/>-->

<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/login.css'/>"/>

<form action="/login" method="POST">
    <div class="form-container form-title">
        <h2>Application Perso</h2>
    </div>
    <div class="form-container">
        <#if Session.SPRING_SECURITY_LAST_EXCEPTION?? && Session.SPRING_SECURITY_LAST_EXCEPTION.message?has_content>
            <h3 class="alert alert-danger" role="alert">Email ou mot de passe incorrect</h3>
        </#if>
        <div class="row">
            <input type="email" id="email" placeholder="Email" name='${form_email}' required>
        </div>

        <div class="row">
            <input type="password" id="password" placeholder="Mot de Passe" name='${form_password}' required>
        </div>

        <div class="row">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <input class="form-btn btn-valider" type="submit" name="valider" value="S'identifier">
        </div>

    </div>
</form>