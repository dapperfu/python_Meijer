package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import gw.AbstractC14426o;
import gw.C14416e;
import gw.InterfaceC14418g;
import gw.L;
import gw.w;
import java.io.IOException;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.d;

/* loaded from: classes14.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final d.a callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private final Object instance;
    private okhttp3.d rawCall;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, T> responseConverter;

    static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final InterfaceC14418g delegateSource;
        IOException thrownException;

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable, gw.K
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public okhttp3.j getMediaType() {
            return this.delegate.getMediaType();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public InterfaceC14418g getBodySource() {
            return this.delegateSource;
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }

        ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = w.c(new AbstractC14426o(responseBody.getBodySource()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // gw.AbstractC14426o, gw.K
                public long read(C14416e c14416e, long j10) throws IOException {
                    try {
                        return super.read(c14416e, j10);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.thrownException = e10;
                        throw e10;
                    }
                }
            });
        }
    }

    static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        private final okhttp3.j contentType;

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public okhttp3.j getMediaType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public InterfaceC14418g getBodySource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        NoContentResponseBody(okhttp3.j jVar, long j10) {
            this.contentType = jVar;
            this.contentLength = j10;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.d dVar;
        this.canceled = true;
        synchronized (this) {
            dVar = this.rawCall;
        }
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        okhttp3.d rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(FirebasePerfOkHttpClient.execute(rawCall));
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized L timeout() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create call.", e10);
        }
        return getRawCall().timeout();
    }

    private okhttp3.d createRawCall() throws IOException {
        okhttp3.d dVarB = this.callFactory.b(this.requestFactory.create(this.instance, this.args));
        if (dVarB != null) {
            return dVarB;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private okhttp3.d getRawCall() throws IOException {
        okhttp3.d dVar = this.rawCall;
        if (dVar != null) {
            return dVar;
        }
        Throwable th2 = this.creationFailure;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            okhttp3.d dVarCreateRawCall = createRawCall();
            this.rawCall = dVarCreateRawCall;
            return dVarCreateRawCall;
        } catch (IOException | Error | RuntimeException e10) {
            Utils.throwIfFatal(e10);
            this.creationFailure = e10;
            throw e10;
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        okhttp3.d dVar;
        Throwable th2;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                dVar = this.rawCall;
                th2 = this.creationFailure;
                if (dVar == null && th2 == null) {
                    try {
                        okhttp3.d dVarCreateRawCall = createRawCall();
                        this.rawCall = dVarCreateRawCall;
                        dVar = dVarCreateRawCall;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.throwIfFatal(th2);
                        this.creationFailure = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            callback.onFailure(this, th2);
            return;
        }
        if (this.canceled) {
            dVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(dVar, new Mv.b() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th5) {
                try {
                    callback.onFailure(OkHttpCall.this, th5);
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    th6.printStackTrace();
                }
            }

            @Override // Mv.b
            public void onResponse(okhttp3.d dVar2, okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(response));
                    } catch (Throwable th5) {
                        Utils.throwIfFatal(th5);
                        th5.printStackTrace();
                    }
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    callFailure(th6);
                }
            }

            @Override // Mv.b
            public void onFailure(okhttp3.d dVar2, IOException iOException) {
                callFailure(iOException);
            }
        });
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.d dVar = this.rawCall;
                if (dVar == null || !dVar.getCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    OkHttpCall(RequestFactory requestFactory, Object obj, Object[] objArr, d.a aVar, Converter<ResponseBody, T> converter) {
        this.requestFactory = requestFactory;
        this.instance = obj;
        this.args = objArr;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }

    Response<T> parseResponse(okhttp3.Response response) throws IOException {
        ResponseBody body = response.getBody();
        okhttp3.Response responseC = response.p().b(new NoContentResponseBody(body.getMediaType(), body.getContentLength())).c();
        int code = responseC.getCode();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(body);
                try {
                    return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), responseC);
                } catch (RuntimeException e10) {
                    exceptionCatchingResponseBody.throwIfCaught();
                    throw e10;
                }
            }
            body.close();
            return Response.success((Object) null, responseC);
        }
        try {
            return Response.error(Utils.buffer(body), responseC);
        } finally {
            body.close();
        }
    }
}
