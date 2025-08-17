package com.radiusnetworks.flybuy.sdk.util;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0002B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u000bR\u001e\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0088\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0088\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/util/SingletonHolder;", "T", "", "A", "creator", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "instance", "Ljava/lang/Object;", "getInstance", "arg", "(Ljava/lang/Object;)Ljava/lang/Object;", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class SingletonHolder<T, A> {
    private Function1<? super A, ? extends T> creator;
    private volatile T instance;

    public SingletonHolder(Function1<? super A, ? extends T> creator) {
        Intrinsics.j(creator, "creator");
        this.creator = creator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getInstance$default(SingletonHolder singletonHolder, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInstance");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return singletonHolder.getInstance(obj);
    }

    public final T getInstance(A arg) {
        T tInvoke;
        T t10 = this.instance;
        if (t10 != null) {
            return t10;
        }
        synchronized (this) {
            tInvoke = this.instance;
            if (tInvoke == null) {
                Function1<? super A, ? extends T> function1 = this.creator;
                Intrinsics.g(function1);
                tInvoke = function1.invoke(arg);
                this.instance = tInvoke;
                this.creator = null;
            }
        }
        return tInvoke;
    }
}
