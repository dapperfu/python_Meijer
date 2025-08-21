package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import okhttp3.d;
import retrofit2.Utils;

/* loaded from: classes14.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final d.a callFactory;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, ResponseT> responseConverter;

    static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        @Override // retrofit2.HttpServiceMethod
        protected ReturnT adapt(Call<ResponseT> call, Object[] objArr) {
            return this.callAdapter.adapt(call);
        }

        CallAdapted(RequestFactory requestFactory, d.a aVar, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, aVar, converter);
            this.callAdapter = callAdapter;
        }
    }

    static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;
        private final boolean isUnit;

        @Override // retrofit2.HttpServiceMethod
        protected Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> callAdapt = this.callAdapter.adapt(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.isUnit ? KotlinExtensions.awaitUnit(callAdapt, continuation) : this.isNullable ? KotlinExtensions.awaitNullable(callAdapt, continuation) : KotlinExtensions.await(callAdapt, continuation);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th2) {
                return KotlinExtensions.suspendAndThrow(th2, continuation);
            }
        }

        SuspendForBody(RequestFactory requestFactory, d.a aVar, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter, boolean z10, boolean z11) {
            super(requestFactory, aVar, converter);
            this.callAdapter = callAdapter;
            this.isNullable = z10;
            this.isUnit = z11;
        }
    }

    static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        @Override // retrofit2.HttpServiceMethod
        protected Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> callAdapt = this.callAdapter.adapt(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.awaitResponse(callAdapt, continuation);
            } catch (Exception e10) {
                return KotlinExtensions.suspendAndThrow(e10, continuation);
            }
        }

        SuspendForResponse(RequestFactory requestFactory, d.a aVar, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter) {
            super(requestFactory, aVar, converter);
            this.callAdapter = callAdapter;
        }
    }

    protected abstract ReturnT adapt(Call<ResponseT> call, Object[] objArr);

    static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean zIsUnit;
        boolean z12 = requestFactory.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type parameterLowerBound = Utils.getParameterLowerBound(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.getRawType(parameterLowerBound) == Response.class && (parameterLowerBound instanceof ParameterizedType)) {
                parameterLowerBound = Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound);
                zIsUnit = false;
                z10 = true;
            } else {
                if (Utils.getRawType(parameterLowerBound) == Call.class) {
                    throw Utils.methodError(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound));
                }
                zIsUnit = Utils.isUnit(parameterLowerBound);
                z10 = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, parameterLowerBound);
            annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
            z11 = zIsUnit;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        CallAdapter callAdapterCreateCallAdapter = createCallAdapter(retrofit, method, genericReturnType, annotations);
        Type typeResponseType = callAdapterCreateCallAdapter.responseType();
        if (typeResponseType == okhttp3.Response.class) {
            throw Utils.methodError(method, "'" + Utils.getRawType(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeResponseType == Response.class) {
            throw Utils.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (requestFactory.httpMethod.equals("HEAD") && !Void.class.equals(typeResponseType) && !Utils.isUnit(typeResponseType)) {
            throw Utils.methodError(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        Converter converterCreateResponseConverter = createResponseConverter(retrofit, method, typeResponseType);
        d.a aVar = retrofit.callFactory;
        return !z12 ? new CallAdapted(requestFactory, aVar, converterCreateResponseConverter, callAdapterCreateCallAdapter) : z10 ? new SuspendForResponse(requestFactory, aVar, converterCreateResponseConverter, callAdapterCreateCallAdapter) : new SuspendForBody(requestFactory, aVar, converterCreateResponseConverter, callAdapterCreateCallAdapter, false, z11);
    }

    @Override // retrofit2.ServiceMethod
    final ReturnT invoke(Object obj, Object[] objArr) {
        return adapt(new OkHttpCall(this.requestFactory, obj, objArr, this.callFactory, this.responseConverter), objArr);
    }

    HttpServiceMethod(RequestFactory requestFactory, d.a aVar, Converter<ResponseBody, ResponseT> converter) {
        this.requestFactory = requestFactory;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(type, annotationArr);
        } catch (RuntimeException e10) {
            throw Utils.methodError(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<ResponseBody, ResponseT> createResponseConverter(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw Utils.methodError(method, e10, "Unable to create converter for %s", type);
        }
    }
}
