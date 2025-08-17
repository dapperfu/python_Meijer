package com.google.maps.internal;

import com.google.appengine.api.urlfetch.HTTPHeader;
import com.google.appengine.api.urlfetch.HTTPRequest;
import com.google.appengine.api.urlfetch.HTTPResponse;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.maps.GeolocationApi;
import com.google.maps.ImageResult;
import com.google.maps.PendingResult;
import com.google.maps.errors.ApiException;
import com.google.maps.errors.UnknownErrorException;
import com.google.maps.internal.ApiResponse;
import com.google.maps.metrics.RequestMetrics;
import com.google.maps.model.AddressComponentType;
import com.google.maps.model.AddressType;
import com.google.maps.model.Distance;
import com.google.maps.model.Duration;
import com.google.maps.model.EncodedPolyline;
import com.google.maps.model.Fare;
import com.google.maps.model.LatLng;
import com.google.maps.model.LocationType;
import com.google.maps.model.OpeningHours;
import com.google.maps.model.PlaceDetails;
import com.google.maps.model.PriceLevel;
import com.google.maps.model.TravelMode;
import com.google.maps.model.VehicleType;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZonedDateTime;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import qw.c;
import qw.d;

/* loaded from: classes7.dex */
public class GaePendingResult<T, R extends ApiResponse<T>> implements PendingResult<T> {
    private static final c LOG = d.j(GaePendingResult.class.getName());
    private static final List<Integer> RETRY_ERROR_CODES = Arrays.asList(Integer.valueOf(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR), Integer.valueOf(HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE), Integer.valueOf(HttpResponseStatus.ERROR_GATEWAY_TIMEOUT));
    private Future<HTTPResponse> call;
    private final URLFetchService client;
    private long errorTimeOut;
    private final ExceptionsAllowedToRetry exceptionsAllowedToRetry;
    private final com.google.gson.c fieldNamingPolicy;
    private final Integer maxRetries;
    private final RequestMetrics metrics;
    private final HTTPRequest request;
    private final Class<R> responseClass;
    private int retryCounter = 0;
    private long cumulativeSleepTime = 0;

    private boolean shouldRetry(HTTPResponse hTTPResponse) {
        if (!RETRY_ERROR_CODES.contains(Integer.valueOf(hTTPResponse.getResponseCode())) || this.cumulativeSleepTime >= this.errorTimeOut) {
            return false;
        }
        Integer num = this.maxRetries;
        return num == null || this.retryCounter < num.intValue();
    }

    private T retry() throws InterruptedException, IOException, ApiException {
        int i10 = this.retryCounter + 1;
        this.retryCounter = i10;
        LOG.m("Retrying request. Retry #{}", Integer.valueOf(i10));
        this.metrics.startNetwork();
        this.call = this.client.fetchAsync(this.request);
        return await();
    }

    @Override // com.google.maps.PendingResult
    public T await() throws ExecutionException, InterruptedException, IOException, ApiException {
        try {
            HTTPResponse hTTPResponse = this.call.get();
            this.metrics.endNetwork();
            return parseResponse(this, hTTPResponse);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw new UnknownErrorException("Unexpected exception from " + e10.getMessage());
        }
    }

    @Override // com.google.maps.PendingResult
    public void cancel() {
        this.call.cancel(true);
    }

    @Override // com.google.maps.PendingResult
    public void setCallback(PendingResult.Callback<T> callback) {
        throw new RuntimeException("setCallback not implemented for Google App Engine");
    }

    public GaePendingResult(HTTPRequest hTTPRequest, URLFetchService uRLFetchService, Class<R> cls, com.google.gson.c cVar, long j10, Integer num, ExceptionsAllowedToRetry exceptionsAllowedToRetry, RequestMetrics requestMetrics) {
        this.request = hTTPRequest;
        this.client = uRLFetchService;
        this.responseClass = cls;
        this.fieldNamingPolicy = cVar;
        this.errorTimeOut = j10;
        this.maxRetries = num;
        this.exceptionsAllowedToRetry = exceptionsAllowedToRetry;
        this.metrics = requestMetrics;
        requestMetrics.startNetwork();
        this.call = uRLFetchService.fetchAsync(hTTPRequest);
    }

    private T parseResponse(GaePendingResult<T, R> gaePendingResult, HTTPResponse hTTPResponse) throws Exception {
        try {
            T responseInternal = parseResponseInternal(gaePendingResult, hTTPResponse);
            this.metrics.endRequest(null, hTTPResponse.getResponseCode(), this.retryCounter);
            return responseInternal;
        } catch (Exception e10) {
            this.metrics.endRequest(e10, hTTPResponse.getResponseCode(), this.retryCounter);
            throw e10;
        }
    }

    private T parseResponseInternal(GaePendingResult<T, R> gaePendingResult, HTTPResponse hTTPResponse) throws InterruptedException, ApiException, IOException {
        if (shouldRetry(hTTPResponse)) {
            return gaePendingResult.retry();
        }
        byte[] content = hTTPResponse.getContent();
        String value = null;
        for (HTTPHeader hTTPHeader : hTTPResponse.getHeaders()) {
            if (hTTPHeader.getName().equalsIgnoreCase("Content-Type")) {
                value = hTTPHeader.getValue();
            }
        }
        if (value != null && value.startsWith("image") && this.responseClass == ImageResult.Response.class && hTTPResponse.getResponseCode() == 200) {
            return (T) new ImageResult(value, content);
        }
        try {
            ApiResponse apiResponse = (ApiResponse) new f().d(ZonedDateTime.class, new ZonedDateTimeAdapter()).d(Distance.class, new DistanceAdapter()).d(Duration.class, new DurationAdapter()).d(Fare.class, new FareAdapter()).d(LatLng.class, new LatLngAdapter()).d(AddressComponentType.class, new SafeEnumAdapter(AddressComponentType.UNKNOWN)).d(AddressType.class, new SafeEnumAdapter(AddressType.UNKNOWN)).d(TravelMode.class, new SafeEnumAdapter(TravelMode.UNKNOWN)).d(LocationType.class, new SafeEnumAdapter(LocationType.UNKNOWN)).d(PlaceDetails.Review.AspectRating.RatingType.class, new SafeEnumAdapter(PlaceDetails.Review.AspectRating.RatingType.UNKNOWN)).d(VehicleType.class, new SafeEnumAdapter(VehicleType.OTHER)).d(OpeningHours.Period.OpenClose.DayOfWeek.class, new DayOfWeekAdapter()).d(PriceLevel.class, new PriceLevelAdapter()).d(Instant.class, new InstantAdapter()).d(LocalTime.class, new LocalTimeAdapter()).d(GeolocationApi.Response.class, new GeolocationResponseAdapter()).d(EncodedPolyline.class, new EncodedPolylineInstanceCreator("")).f(this.fieldNamingPolicy).b().o(new String(content, "utf8"), this.responseClass);
            if (apiResponse.successful()) {
                return (T) apiResponse.getResult();
            }
            ApiException error = apiResponse.getError();
            if (shouldRetry(error)) {
                return gaePendingResult.retry();
            }
            throw error;
        } catch (JsonSyntaxException e10) {
            if (hTTPResponse.getResponseCode() > 399) {
                throw new IOException(String.format("Server Error: %d %s", Integer.valueOf(hTTPResponse.getResponseCode()), new String(hTTPResponse.getContent(), Charset.defaultCharset())));
            }
            throw e10;
        }
    }

    private boolean shouldRetry(ApiException apiException) {
        if (!this.exceptionsAllowedToRetry.contains(apiException.getClass()) || this.cumulativeSleepTime >= this.errorTimeOut) {
            return false;
        }
        Integer num = this.maxRetries;
        return num == null || this.retryCounter < num.intValue();
    }

    @Override // com.google.maps.PendingResult
    public T awaitIgnoreError() {
        try {
            return await();
        } catch (Exception unused) {
            return null;
        }
    }
}
