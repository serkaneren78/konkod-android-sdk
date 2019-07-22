# Getting started

Kontrol Kodu

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

* Browse to locate the folder containing the source code. Select the location of the Konkod gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

## How to Use

The following section explains how to use the Konkod library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':KonkodLib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':KonkodLib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Konkod&workspaceName=Konkod&projectName=KonkodLib&rootNamespace=com.example.www)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > KonkodLib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| authorization | JWT Authorization header using the Bearer scheme. Example: "Bearer {token}" |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String authorization = "authorization"; // JWT Authorization header using the Bearer scheme. Example: "Bearer {token}"

com.example.www.Configuration.initialize(appContext);
KonkodClient client = new KonkodClient(authorization);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [UserController](#user_controller)
* [SurveyController](#survey_controller)
* [KonkodController](#konkod_controller)
* [AuthenticationController](#authentication_controller)

## <a name="user_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.www.controllers.UserController") UserController

### Get singleton instance

The singleton instance of the ``` UserController ``` class can be accessed from the API Client.

```java
UserController user = client.getUser();
```

### <a name="create_user_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.www.controllers.UserController.createUserPOSTAsync") createUserPOSTAsync

> TODO: Add a method description


```java
void createUserPOSTAsync(
        final User request,
        final APICallBack<User> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    User request = new User();
    // Invoking the API call with sample inputs
    user.createUserPOSTAsync(request, new APICallBack<User>() {
        public void onSuccess(HttpContext context, User response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="survey_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.www.controllers.SurveyController") SurveyController

### Get singleton instance

The singleton instance of the ``` SurveyController ``` class can be accessed from the API Client.

```java
SurveyController survey = client.getSurvey();
```

### <a name="create_survey_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.www.controllers.SurveyController.createSurveyPOSTAsync") createSurveyPOSTAsync

> TODO: Add a method description


```java
void createSurveyPOSTAsync(
        final Survey request,
        final APICallBack<Survey> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    Survey request = new Survey();
    // Invoking the API call with sample inputs
    survey.createSurveyPOSTAsync(request, new APICallBack<Survey>() {
        public void onSuccess(HttpContext context, Survey response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="konkod_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.www.controllers.KonkodController") KonkodController

### Get singleton instance

The singleton instance of the ``` KonkodController ``` class can be accessed from the API Client.

```java
KonkodController konkod = client.getKonkod();
```

### <a name="get_konkod_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.www.controllers.KonkodController.getKonkodGETAsync") getKonkodGETAsync

> TODO: Add a method description


```java
void getKonkodGETAsync(
        final String phone,
        final APICallBack<List<Konkod>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phone |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String phone = "phone";
// Invoking the API call with sample inputs
konkod.getKonkodGETAsync(phone, new APICallBack<List<Konkod>>() {
    public void onSuccess(HttpContext context, List<Konkod> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="authentication_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.www.controllers.AuthenticationController") AuthenticationController

### Get singleton instance

The singleton instance of the ``` AuthenticationController ``` class can be accessed from the API Client.

```java
AuthenticationController authentication = client.getAuthentication();
```

### <a name="create_authentication_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.www.controllers.AuthenticationController.createAuthenticationPOSTAsync") createAuthenticationPOSTAsync

> TODO: Add a method description


```java
void createAuthenticationPOSTAsync(
        final ClientCredentials credentials,
        final APICallBack<JWTToken> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| credentials |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    ClientCredentials credentials = new ClientCredentials();
    // Invoking the API call with sample inputs
    authentication.createAuthenticationPOSTAsync(credentials, new APICallBack<JWTToken>() {
        public void onSuccess(HttpContext context, JWTToken response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)



