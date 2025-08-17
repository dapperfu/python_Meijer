package com.snapchat.djinni;

import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class Outcome<Result, Error> {

    public interface ErrorHandler<R, Error> {
        R apply(Error error);
    }

    public interface ResultHandler<R, Result> {
        R apply(Result result);
    }

    public static /* synthetic */ Object b(Object obj) {
        return null;
    }

    public static /* synthetic */ Object c(Object obj, Object obj2) {
        return obj;
    }

    public static /* synthetic */ Object e(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object g(Object obj) {
        return obj;
    }

    public abstract <R> R match(ResultHandler<R, Result> resultHandler, ErrorHandler<R, Error> errorHandler);

    private Outcome() {
    }

    public static <Result, Error> Outcome<Result, Error> fromError(final Error error) {
        return new Outcome<Result, Error>() { // from class: com.snapchat.djinni.Outcome.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.snapchat.djinni.Outcome
            public <R> R match(ResultHandler<R, Result> resultHandler, ErrorHandler<R, Error> errorHandler) {
                return (R) errorHandler.apply(error);
            }
        };
    }

    public static <Result, Error> Outcome<Result, Error> fromResult(final Result result) {
        return new Outcome<Result, Error>() { // from class: com.snapchat.djinni.Outcome.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.snapchat.djinni.Outcome
            public <R> R match(ResultHandler<R, Result> resultHandler, ErrorHandler<R, Error> errorHandler) {
                return (R) resultHandler.apply(result);
            }
        };
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Outcome)) {
            return false;
        }
        final Outcome outcome = (Outcome) obj;
        return ((Boolean) match(new ResultHandler() { // from class: com.snapchat.djinni.g
            @Override // com.snapchat.djinni.Outcome.ResultHandler
            public final Object apply(Object obj2) {
                return Boolean.valueOf(obj2.equals(this.f126287a.resultOr(null)));
            }
        }, new ErrorHandler() { // from class: com.snapchat.djinni.h
            @Override // com.snapchat.djinni.Outcome.ErrorHandler
            public final Object apply(Object obj2) {
                return Boolean.valueOf(obj2.equals(this.f126288a.errorOrNull()));
            }
        })).booleanValue();
    }

    public Error errorOrNull() {
        return (Error) match(new ResultHandler() { // from class: com.snapchat.djinni.c
            @Override // com.snapchat.djinni.Outcome.ResultHandler
            public final Object apply(Object obj) {
                return Outcome.b(obj);
            }
        }, new ErrorHandler() { // from class: com.snapchat.djinni.d
            @Override // com.snapchat.djinni.Outcome.ErrorHandler
            public final Object apply(Object obj) {
                return Outcome.e(obj);
            }
        });
    }

    public Result resultOr(final Result result) {
        return (Result) match(new ResultHandler() { // from class: com.snapchat.djinni.i
            @Override // com.snapchat.djinni.Outcome.ResultHandler
            public final Object apply(Object obj) {
                return Outcome.g(obj);
            }
        }, new ErrorHandler() { // from class: com.snapchat.djinni.j
            @Override // com.snapchat.djinni.Outcome.ErrorHandler
            public final Object apply(Object obj) {
                return Outcome.c(result, obj);
            }
        });
    }

    public int hashCode() {
        final Class<?> cls = getClass();
        return ((Integer) match(new ResultHandler() { // from class: com.snapchat.djinni.e
            @Override // com.snapchat.djinni.Outcome.ResultHandler
            public final Object apply(Object obj) {
                return Integer.valueOf(Objects.hash(cls, 1, obj));
            }
        }, new ErrorHandler() { // from class: com.snapchat.djinni.f
            @Override // com.snapchat.djinni.Outcome.ErrorHandler
            public final Object apply(Object obj) {
                return Integer.valueOf(Objects.hash(cls, 0, obj));
            }
        })).intValue();
    }
}
