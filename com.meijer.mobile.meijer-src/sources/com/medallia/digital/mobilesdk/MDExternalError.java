package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class MDExternalError extends MedalliaDigitalError implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f92395a = "Unspecified configuration error";

    public enum ExternalError {
        REQUEST_TIMEOUT(10010, "Request Timeout"),
        NO_INTERNET_CONNECTION_AVAILABLE(10011, "No internet connection available"),
        NO_INTERNET_CONNECTION_AVAILABLE_11(10111, "No internet connection available"),
        NO_INTERNET_CONNECTION_AVAILABLE_12(10112, "No internet connection available"),
        NO_INTERNET_CONNECTION_AVAILABLE_13(10113, "No internet connection available"),
        NO_INTERNET_CONNECTION_AVAILABLE_14(10114, "No internet connection available"),
        SERVER_COM_ERROR(10012, "Server communication error"),
        UNSPECIFIED_CONFIGURATION_ERROR_13(10013, MDExternalError.f92395a),
        UNSPECIFIED_CONFIGURATION_ERROR_14(10014, MDExternalError.f92395a),
        UNSPECIFIED_CONFIGURATION_ERROR_15(10015, MDExternalError.f92395a),
        UNSPECIFIED_CONFIGURATION_ERROR_16(10016, MDExternalError.f92395a),
        AUTHORIZATION_FAILED_17(10017, "Authorization failed"),
        AUTHORIZATION_FAILED_18(10018, "Authorization failed"),
        AUTHORIZATION_FAILED_19(10019, "Authorization failed"),
        AUTHORIZATION_FAILED_20(10020, "Authorization failed"),
        API_TOKEN_NOT_VALID(10021, "Api token is not valid"),
        APPLICATION_IS_NULL(10023, "Application is NULL"),
        OS_VERSION_IS_NOT_SUPPORTED(10024, "OS version is not supported"),
        WRONG_PROPERTY_TYPE(10025, "You are using an unsupported OS token"),
        SDK_NOT_INITIALIZED(10030, "SDK not initialized"),
        SDK_INITIALIZATION_IN_PROGRESS(10031, "SDK initialization in progress"),
        SDK_IS_ALREADY_INITIALIZED(10032, "SDK is already initialized"),
        APP_IS_IN_BG(10033, "App is in BG"),
        SDK_IS_KILLED(10034, "SDK functionality has been turned off"),
        SDK_WAS_STOPPED(10035, "SDK is stopped"),
        FORM_IS_NOT_AVAILABLE(10040, "Form is not available"),
        FORM_NOT_EXISTS_OR_NOT_PUBLISH(10041, "Form does not exist or is not published"),
        FORM_IS_ALREADY_DISPLAYED(10042, "A form is already displayed"),
        FORM_DISPLAY_TIMEOUT(10043, "Form Display Timeout"),
        FORM_INCORRECT_INVITATION_TYPE(10044, "Incorrect form trigger/invite"),
        FORM_INVALID_ENGAGEMENT_ID(10060, "Invalid Engagement ID"),
        TRANSLATION_INVALID_FORMAT(10050, "Invalid Format - Supported formats: XX-XX, XX, XX_XX, XX-XXX, XX_XXX, XXX, XXX-XX, XXX_XX, XXX-XXX, XXX_XXX");

        private final int errorCode;
        private final String message;

        ExternalError(int i10, String str) {
            this.errorCode = i10;
            this.message = str;
        }

        public int getErrorCode() {
            return this.errorCode;
        }

        protected String getMessage() {
            return this.message;
        }

        @Override // java.lang.Enum
        public String toString() {
            return getMessage();
        }
    }

    protected MDExternalError(ExternalError externalError) {
        super(externalError.errorCode, externalError.message);
    }
}
