package Fv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "a", "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: Fv.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3595e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11042a;

    static {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.i(property, "getProperty(...)");
            objB = Result.b(StringsKt.v(property));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.g(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f11042a = num != null ? num.intValue() : 2097152;
    }
}
