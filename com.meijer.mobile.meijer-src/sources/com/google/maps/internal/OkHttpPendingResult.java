package com.google.maps.internal;

import Mv.b;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.maps.GeolocationApi;
import com.google.maps.ImageResult;
import com.google.maps.PendingResult;
import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiResponse;
import com.google.maps.metrics.RequestMetrics;
import com.google.maps.model.AddressComponentType;
import com.google.maps.model.AddressType;
import com.google.maps.model.Distance;
import com.google.maps.model.Duration;
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
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import mw.c;
import mw.e;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.d;

/* loaded from: classes8.dex */
public class OkHttpPendingResult<T, R extends ApiResponse<T>> implements PendingResult<T>, b {
    private static final c LOG = e.k(OkHttpPendingResult.class.getName());
    private static final List<Integer> RETRY_ERROR_CODES = Arrays.asList(Integer.valueOf(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR), Integer.valueOf(HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE), Integer.valueOf(HttpResponseStatus.ERROR_GATEWAY_TIMEOUT));
    private d call;
    private PendingResult.Callback<T> callback;
    private final OkHttpClient client;
    private long errorTimeOut;
    private ExceptionsAllowedToRetry exceptionsAllowedToRetry;
    private final com.google.gson.c fieldNamingPolicy;
    private final Integer maxRetries;
    private final RequestMetrics metrics;
    private final Request request;
    private final Class<R> responseClass;
    private int retryCounter = 0;
    private long cumulativeSleepTime = 0;

    private class QueuedResponse {

        /* renamed from: e, reason: collision with root package name */
        private final IOException f91231e;
        private final OkHttpPendingResult<T, R> request;
        private final Response response;

        public QueuedResponse(OkHttpPendingResult<T, R> okHttpPendingResult, Response response) {
            this.request = okHttpPendingResult;
            this.response = response;
            this.f91231e = null;
        }

        public QueuedResponse(OkHttpPendingResult<T, R> okHttpPendingResult, IOException iOException) {
            this.request = okHttpPendingResult;
            this.response = null;
            this.f91231e = iOException;
        }
    }

    private boolean shouldRetry(Response response) {
        if (!RETRY_ERROR_CODES.contains(Integer.valueOf(response.getCode())) || this.cumulativeSleepTime >= this.errorTimeOut) {
            return false;
        }
        Integer num = this.maxRetries;
        return num == null || this.retryCounter < num.intValue();
    }

    private T retry() throws InterruptedException, ApiException, IOException {
        this.retryCounter++;
        LOG.q("Retrying request. Retry #" + this.retryCounter);
        this.metrics.startNetwork();
        this.call = this.client.b(this.request);
        return await();
    }

    @Override // com.google.maps.PendingResult
    public T await() throws InterruptedException, IOException, ApiException {
        if (this.retryCounter > 0) {
            long jPow = (long) (Math.pow(1.5d, r0 - 1) * 0.5d * (Math.random() + 0.5d) * 1000.0d);
            LOG.a(String.format("Sleeping between errors for %dms (retry #%d, already slept %dms)", Long.valueOf(jPow), Integer.valueOf(this.retryCounter), Long.valueOf(this.cumulativeSleepTime)));
            this.cumulativeSleepTime += jPow;
            try {
                Thread.sleep(jPow);
            } catch (InterruptedException unused) {
            }
        }
        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        FirebasePerfOkHttpClient.enqueue(this.call, new b() { // from class: com.google.maps.internal.OkHttpPendingResult.1
            @Override // Mv.b
            public void onFailure(d dVar, IOException iOException) {
                OkHttpPendingResult.this.metrics.endNetwork();
                arrayBlockingQueue.add(new QueuedResponse(this, iOException));
            }

            @Override // Mv.b
            public void onResponse(d dVar, Response response) throws IOException {
                OkHttpPendingResult.this.metrics.endNetwork();
                arrayBlockingQueue.add(new QueuedResponse(this, response));
            }
        });
        QueuedResponse queuedResponse = (QueuedResponse) arrayBlockingQueue.take();
        if (queuedResponse.response != null) {
            return parseResponse(queuedResponse.request, queuedResponse.response);
        }
        this.metrics.endRequest(queuedResponse.f91231e, 0, this.retryCounter);
        throw queuedResponse.f91231e;
    }

    @Override // com.google.maps.PendingResult
    public void cancel() {
        this.call.cancel();
    }

    @Override // Mv.b
    public void onFailure(d dVar, IOException iOException) {
        this.metrics.endNetwork();
        if (this.callback != null) {
            this.metrics.endRequest(iOException, 0, this.retryCounter);
            this.callback.onFailure(iOException);
        }
    }

    @Override // Mv.b
    public void onResponse(d dVar, Response response) throws IOException {
        this.metrics.endNetwork();
        PendingResult.Callback<T> callback = this.callback;
        if (callback != null) {
            try {
                callback.onResult(parseResponse(this, response));
            } catch (Exception e10) {
                this.callback.onFailure(e10);
            }
        }
    }

    @Override // com.google.maps.PendingResult
    public void setCallback(PendingResult.Callback<T> callback) {
        this.callback = callback;
        FirebasePerfOkHttpClient.enqueue(this.call, this);
    }

    public OkHttpPendingResult(Request request, OkHttpClient okHttpClient, Class<R> cls, com.google.gson.c cVar, long j10, Integer num, ExceptionsAllowedToRetry exceptionsAllowedToRetry, RequestMetrics requestMetrics) {
        this.request = request;
        this.client = okHttpClient;
        this.responseClass = cls;
        this.fieldNamingPolicy = cVar;
        this.errorTimeOut = j10;
        this.maxRetries = num;
        this.exceptionsAllowedToRetry = exceptionsAllowedToRetry;
        this.metrics = requestMetrics;
        requestMetrics.startNetwork();
        this.call = okHttpClient.b(request);
    }

    private T parseResponse(OkHttpPendingResult<T, R> okHttpPendingResult, Response response) throws Exception {
        try {
            T responseInternal = parseResponseInternal(okHttpPendingResult, response);
            this.metrics.endRequest(null, response.getCode(), this.retryCounter);
            return responseInternal;
        } catch (Exception e10) {
            this.metrics.endRequest(e10, response.getCode(), this.retryCounter);
            throw e10;
        }
    }

    private T parseResponseInternal(OkHttpPendingResult<T, R> okHttpPendingResult, Response response) throws InterruptedException, ApiException, IOException {
        if (shouldRetry(response)) {
            response.close();
            return okHttpPendingResult.retry();
        }
        ResponseBody body = response.getBody();
        try {
            byte[] bArrBytes = body.bytes();
            body.close();
            String strH = response.h("Content-Type");
            if (strH != null && strH.startsWith("image") && this.responseClass == ImageResult.Response.class && response.getCode() == 200) {
                return (T) new ImageResult(strH, bArrBytes);
            }
            try {
                ApiResponse apiResponse = (ApiResponse) new f().d(ZonedDateTime.class, new ZonedDateTimeAdapter()).d(Distance.class, new DistanceAdapter()).d(Duration.class, new DurationAdapter()).d(Fare.class, new FareAdapter()).d(LatLng.class, new LatLngAdapter()).d(AddressComponentType.class, new SafeEnumAdapter(AddressComponentType.UNKNOWN)).d(AddressType.class, new SafeEnumAdapter(AddressType.UNKNOWN)).d(TravelMode.class, new SafeEnumAdapter(TravelMode.UNKNOWN)).d(LocationType.class, new SafeEnumAdapter(LocationType.UNKNOWN)).d(PlaceDetails.Review.AspectRating.RatingType.class, new SafeEnumAdapter(PlaceDetails.Review.AspectRating.RatingType.UNKNOWN)).d(VehicleType.class, new SafeEnumAdapter(VehicleType.OTHER)).d(OpeningHours.Period.OpenClose.DayOfWeek.class, new DayOfWeekAdapter()).d(PriceLevel.class, new PriceLevelAdapter()).d(Instant.class, new InstantAdapter()).d(LocalTime.class, new LocalTimeAdapter()).d(GeolocationApi.Response.class, new GeolocationResponseAdapter()).f(this.fieldNamingPolicy).b().o(new String(bArrBytes, "utf8"), this.responseClass);
                if (apiResponse.successful()) {
                    return (T) apiResponse.getResult();
                }
                ApiException error = apiResponse.getError();
                if (shouldRetry(error)) {
                    return okHttpPendingResult.retry();
                }
                throw error;
            } catch (JsonSyntaxException e10) {
                if (!response.getIsSuccessful()) {
                    throw new IOException(String.format("Server Error: %d %s", Integer.valueOf(response.getCode()), response.getMessage()));
                }
                throw e10;
            }
        } catch (Throwable th2) {
            if (body != null) {
                try {
                    body.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
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
