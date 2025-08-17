package com.google.maps.errors;

/* loaded from: classes7.dex */
public class ApiException extends Exception {
    private static final long serialVersionUID = -6550606366694345191L;

    public static ApiException from(String str, String str2) {
        if ("OK".equals(str)) {
            return null;
        }
        if ("INVALID_REQUEST".equals(str)) {
            return new InvalidRequestException(str2);
        }
        if ("MAX_ELEMENTS_EXCEEDED".equals(str)) {
            return new MaxElementsExceededException(str2);
        }
        if ("MAX_ROUTE_LENGTH_EXCEEDED".equals(str)) {
            return new MaxRouteLengthExceededException(str2);
        }
        if ("MAX_WAYPOINTS_EXCEEDED".equals(str)) {
            return new MaxWaypointsExceededException(str2);
        }
        if ("NOT_FOUND".equals(str)) {
            return new NotFoundException(str2);
        }
        if ("OVER_QUERY_LIMIT".equals(str)) {
            return "You have exceeded your daily request quota for this API. If you did not set a custom daily request quota, verify your project has an active billing account: http://g.co/dev/maps-no-account".equalsIgnoreCase(str2) ? new OverDailyLimitException(str2) : new OverQueryLimitException(str2);
        }
        if ("REQUEST_DENIED".equals(str)) {
            return new RequestDeniedException(str2);
        }
        if ("UNKNOWN_ERROR".equals(str)) {
            return new UnknownErrorException(str2);
        }
        if ("ZERO_RESULTS".equals(str)) {
            return new ZeroResultsException(str2);
        }
        if ("ACCESS_NOT_CONFIGURED".equals(str)) {
            return new AccessNotConfiguredException(str2);
        }
        if ("INVALID_ARGUMENT".equals(str)) {
            return new InvalidRequestException(str2);
        }
        if ("RESOURCE_EXHAUSTED".equals(str)) {
            return new OverQueryLimitException(str2);
        }
        if ("PERMISSION_DENIED".equals(str)) {
            return new RequestDeniedException(str2);
        }
        if ("keyInvalid".equals(str)) {
            return new AccessNotConfiguredException(str2);
        }
        if ("dailyLimitExceeded".equals(str)) {
            return new OverDailyLimitException(str2);
        }
        if ("userRateLimitExceeded".equals(str)) {
            return new OverQueryLimitException(str2);
        }
        if ("notFound".equals(str)) {
            return new NotFoundException(str2);
        }
        if ("parseError".equals(str)) {
            return new InvalidRequestException(str2);
        }
        if ("invalid".equals(str)) {
            return new InvalidRequestException(str2);
        }
        return new UnknownErrorException("An unexpected error occurred. Status: " + str + ", Message: " + str2);
    }

    protected ApiException(String str) {
        super(str);
    }
}
