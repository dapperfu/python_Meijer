package com.scandit.djinni;

import androidx.annotation.Keep;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class ResultOrError<Result, Error> {

    public interface ErrorHandler<R, Error> {
        R apply(Error error);
    }

    public interface ResultHandler<R, Result> {
        R apply(Result result);
    }

    public static /* synthetic */ Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object e(Object obj) {
        return null;
    }

    public static /* synthetic */ Object f(Object obj, Object obj2) {
        return obj;
    }

    public static /* synthetic */ Object g(Object obj) {
        return obj;
    }

    public abstract <R> R match(ResultHandler<R, Result> resultHandler, ErrorHandler<R, Error> errorHandler);

    private ResultOrError() {
    }

    @Keep
    public static <Result, Error> ResultOrError<Result, Error> fromError(final Error error) {
        return new ResultOrError<Result, Error>() { // from class: com.scandit.djinni.ResultOrError.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.scandit.djinni.ResultOrError
            public <R> R match(ResultHandler<R, Result> resultHandler, ErrorHandler<R, Error> errorHandler) {
                return (R) errorHandler.apply(error);
            }
        };
    }

    @Keep
    public static <Result, Error> ResultOrError<Result, Error> fromResult(final Result result) {
        return new ResultOrError<Result, Error>() { // from class: com.scandit.djinni.ResultOrError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.scandit.djinni.ResultOrError
            public <R> R match(ResultHandler<R, Result> resultHandler, ErrorHandler<R, Error> errorHandler) {
                return (R) resultHandler.apply(result);
            }
        };
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResultOrError)) {
            return false;
        }
        final ResultOrError resultOrError = (ResultOrError) obj;
        return ((Boolean) match(new ResultHandler() { // from class: com.scandit.djinni.e
            @Override // com.scandit.djinni.ResultOrError.ResultHandler
            public final Object apply(Object obj2) {
                return Boolean.valueOf(obj2.equals(this.f126275a.resultOr(null)));
            }
        }, new ErrorHandler() { // from class: com.scandit.djinni.f
            @Override // com.scandit.djinni.ResultOrError.ErrorHandler
            public final Object apply(Object obj2) {
                return Boolean.valueOf(obj2.equals(this.f126276a.errorOrNull()));
            }
        })).booleanValue();
    }

    public Error errorOrNull() {
        return (Error) match(new ResultHandler() { // from class: com.scandit.djinni.c
            @Override // com.scandit.djinni.ResultOrError.ResultHandler
            public final Object apply(Object obj) {
                return ResultOrError.e(obj);
            }
        }, new ErrorHandler() { // from class: com.scandit.djinni.d
            @Override // com.scandit.djinni.ResultOrError.ErrorHandler
            public final Object apply(Object obj) {
                return ResultOrError.g(obj);
            }
        });
    }

    public Result resultOr(final Result result) {
        return (Result) match(new ResultHandler() { // from class: com.scandit.djinni.g
            @Override // com.scandit.djinni.ResultOrError.ResultHandler
            public final Object apply(Object obj) {
                return ResultOrError.a(obj);
            }
        }, new ErrorHandler() { // from class: com.scandit.djinni.h
            @Override // com.scandit.djinni.ResultOrError.ErrorHandler
            public final Object apply(Object obj) {
                return ResultOrError.f(result, obj);
            }
        });
    }

    public int hashCode() {
        final Class<?> cls = getClass();
        return ((Integer) match(new ResultHandler() { // from class: com.scandit.djinni.i
            @Override // com.scandit.djinni.ResultOrError.ResultHandler
            public final Object apply(Object obj) {
                return Integer.valueOf(Objects.hash(cls, 1, obj));
            }
        }, new ErrorHandler() { // from class: com.scandit.djinni.j
            @Override // com.scandit.djinni.ResultOrError.ErrorHandler
            public final Object apply(Object obj) {
                return Integer.valueOf(Objects.hash(cls, 0, obj));
            }
        })).intValue();
    }
}
