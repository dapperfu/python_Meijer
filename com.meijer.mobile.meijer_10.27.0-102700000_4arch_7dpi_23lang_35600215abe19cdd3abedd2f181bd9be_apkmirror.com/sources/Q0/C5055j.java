package Q0;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"LQ0/j;", "LQ0/L;", "", "androidAutofillType", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", "d", "", "other", "", "c", "(ILjava/lang/Object;)Z", "I", "getAndroidAutofillType", "()I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: Q0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5055j implements L {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int androidAutofillType;

    public static int b(int i10) {
        return i10;
    }

    public static final /* synthetic */ C5055j a(int i10) {
        return new C5055j(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C5055j) && i10 == ((C5055j) obj).getAndroidAutofillType();
    }

    public static String e(int i10) {
        return "AndroidContentDataType(androidAutofillType=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.androidAutofillType, obj);
    }

    /* renamed from: f, reason: from getter */
    public final /* synthetic */ int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public int hashCode() {
        return d(this.androidAutofillType);
    }

    public String toString() {
        return e(this.androidAutofillType);
    }

    private /* synthetic */ C5055j(int i10) {
        this.androidAutofillType = i10;
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }
}
