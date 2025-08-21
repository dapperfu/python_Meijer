package com.google.maps;

import com.google.maps.PendingResult;
import com.google.maps.PendingResultBase;
import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.internal.HttpHeaders;
import com.google.maps.internal.StringJoin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public abstract class PendingResultBase<T, A extends PendingResultBase<T, A, R>, R extends ApiResponse<T>> implements PendingResult<T> {
    private final ApiConfig config;
    private final GeoApiContext context;
    private PendingResult<T> delegate;
    private Class<? extends R> responseClass;
    private HashMap<String, List<String>> params = new HashMap<>();
    private Map<String, String> headers = new HashMap();

    private A getInstance() {
        return this;
    }

    protected A param(String str, String str2) {
        this.params.put(str, new ArrayList());
        return (A) paramAddToList(str, str2);
    }

    protected A paramAddToList(String str, String str2) {
        if (this.params.get(str) == null) {
            this.params.put(str, new ArrayList());
        }
        this.params.get(str).add(str2);
        return (A) getInstance();
    }

    protected abstract void validateRequest();

    private PendingResult<T> makeRequest() {
        if (this.delegate != null) {
            throw new IllegalStateException("'await', 'awaitIgnoreError' or 'setCallback' was already called.");
        }
        validateRequest();
        String str = this.config.requestVerb;
        str.getClass();
        if (str.equals("GET")) {
            PendingResult<T> pendingResult = this.context.get(this.config, this.responseClass, this.headers, this.params);
            this.delegate = pendingResult;
            return pendingResult;
        }
        if (!str.equals("POST")) {
            throw new IllegalStateException(String.format("Unexpected request method '%s'", this.config.requestVerb));
        }
        PendingResult<T> pendingResultPost = this.context.post(this.config, this.responseClass, this.headers, this.params);
        this.delegate = pendingResultPost;
        return pendingResultPost;
    }

    @Override // com.google.maps.PendingResult
    public final void cancel() {
        PendingResult<T> pendingResult = this.delegate;
        if (pendingResult == null) {
            return;
        }
        pendingResult.cancel();
    }

    public A channel(String str) {
        return (A) param("channel", str);
    }

    public A experienceIds(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.headers.remove(HttpHeaders.X_GOOG_MAPS_EXPERIENCE_ID);
            return (A) getInstance();
        }
        header(HttpHeaders.X_GOOG_MAPS_EXPERIENCE_ID, StringJoin.join((CharSequence) ",", strArr));
        return (A) getInstance();
    }

    public A header(String str, String str2) {
        this.headers.put(str, str2);
        return (A) getInstance();
    }

    public final A language(String str) {
        return (A) param("language", str);
    }

    protected Map<String, List<String>> params() {
        return Collections.unmodifiableMap(this.params);
    }

    protected PendingResultBase(GeoApiContext geoApiContext, ApiConfig apiConfig, Class<? extends R> cls) {
        this.context = geoApiContext;
        this.config = apiConfig;
        this.responseClass = cls;
    }

    @Override // com.google.maps.PendingResult
    public T await() throws InterruptedException, ApiException, IOException {
        return makeRequest().await();
    }

    @Override // com.google.maps.PendingResult
    public final T awaitIgnoreError() {
        return makeRequest().awaitIgnoreError();
    }

    public A custom(String str, String str2) {
        return (A) param(str, str2);
    }

    protected A param(String str, int i10) {
        return (A) param(str, Integer.toString(i10));
    }

    @Override // com.google.maps.PendingResult
    public final void setCallback(PendingResult.Callback<T> callback) {
        makeRequest().setCallback(callback);
    }

    protected A param(String str, StringJoin.UrlValue urlValue) {
        if (urlValue != null) {
            return (A) param(str, urlValue.toUrlValue());
        }
        return (A) getInstance();
    }

    protected A paramAddToList(String str, StringJoin.UrlValue urlValue) {
        if (urlValue != null) {
            return (A) paramAddToList(str, urlValue.toUrlValue());
        }
        return (A) getInstance();
    }
}
