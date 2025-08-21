package rv;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"", "propertyName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: rv.G, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C16952G {

    /* renamed from: a, reason: collision with root package name */
    private static final int f159622a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f159622a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
