package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.a;
import com.android.volley.k;
import com.android.volley.n;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class i<T> implements Comparable<i<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private a.C1250a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private k.a mErrorListener;
    private final n.a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private b mRequestCompleteListener;
    private j mRequestQueue;
    private boolean mResponseDelivered;
    private m mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f63759b;

        a(String str, long j10) {
            this.f63758a = str;
            this.f63759b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.mEventLog.a(this.f63758a, this.f63759b);
            i.this.mEventLog.b(i.this.toString());
        }
    }

    interface b {
        void a(i<?> iVar, k<?> kVar);

        void b(i<?> iVar);
    }

    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public i(String str, k.a aVar) {
        this(-1, str, aVar);
    }

    protected abstract void deliverResponse(T t10);

    protected Map<String, String> getParams() throws AuthFailureError {
        return null;
    }

    protected VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    protected abstract k<T> parseNetworkResponse(h hVar);

    public i(int i10, String str, k.a aVar) {
        this.mEventLog = n.a.f63784c ? new n.a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i10;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new com.android.volley.c());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb2.append(URLEncoder.encode(entry.getKey(), str));
                sb2.append('=');
                sb2.append(URLEncoder.encode(entry.getValue(), str));
                sb2.append('&');
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    public void addMarker(String str) {
        if (n.a.f63784c) {
            this.mEventLog.a(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(i<T> iVar) {
        c priority = getPriority();
        c priority2 = iVar.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - iVar.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public void deliverError(VolleyError volleyError) {
        k.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.onErrorResponse(volleyError);
        }
    }

    void finish(String str) {
        j jVar = this.mRequestQueue;
        if (jVar != null) {
            jVar.c(this);
        }
        if (n.a.f63784c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
            } else {
                this.mEventLog.a(str, id2);
                this.mEventLog.b(toString());
            }
        }
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public a.C1250a getCacheEntry() {
        return this.mCacheEntry;
    }

    public k.a getErrorListener() {
        k.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    protected String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    public c getPriority() {
        return c.NORMAL;
    }

    public m getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mResponseDelivered;
        }
        return z10;
    }

    public boolean isCanceled() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mCanceled;
        }
        return z10;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    void notifyListenerResponseNotUsable() {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.b(this);
        }
    }

    void notifyListenerResponseReceived(k<?> kVar) {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.a(this, kVar);
        }
    }

    void sendEvent(int i10) {
        j jVar = this.mRequestQueue;
        if (jVar != null) {
            jVar.e(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i<?> setCacheEntry(a.C1250a c1250a) {
        this.mCacheEntry = c1250a;
        return this;
    }

    void setNetworkRequestCompleteListener(b bVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i<?> setRequestQueue(j jVar) {
        this.mRequestQueue = jVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i<?> setRetryPolicy(m mVar) {
        this.mRetryPolicy = mVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> setShouldCache(boolean z10) {
        this.mShouldCache = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> setShouldRetryConnectionErrors(boolean z10) {
        this.mShouldRetryConnectionErrors = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> setShouldRetryServerErrors(boolean z10) {
        this.mShouldRetryServerErrors = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "[X] " : "[ ] ");
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri uri;
        String host;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            return host.hashCode();
        }
        return 0;
    }

    public byte[] getBody() throws AuthFailureError {
        Map<String, String> params = getParams();
        if (params != null && params.size() > 0) {
            return encodeParameters(params, getParamsEncoding());
        }
        return null;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method != 0 && method != -1) {
            return Integer.toString(method) + '-' + url;
        }
        return url;
    }

    @Deprecated
    public byte[] getPostBody() throws AuthFailureError {
        Map<String, String> postParams = getPostParams();
        if (postParams != null && postParams.size() > 0) {
            return encodeParameters(postParams, getPostParamsEncoding());
        }
        return null;
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    protected Map<String, String> getPostParams() throws AuthFailureError {
        return getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> setSequence(int i10) {
        this.mSequence = Integer.valueOf(i10);
        return this;
    }
}
