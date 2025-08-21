package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/t;", "Landroidx/compose/ui/text/AnnotatedString$a;", "", "value", "b", "(Ljava/lang/String;)Ljava/lang/String;", "e", "", "d", "(Ljava/lang/String;)I", "", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class t implements AnnotatedString.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    public static final /* synthetic */ t a(String str) {
        return new t(str);
    }

    public static String b(String str) {
        return str;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof t) && Intrinsics.e(str, ((t) obj).getValue());
    }

    public static int d(String str) {
        return str.hashCode();
    }

    public static String e(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    /* renamed from: f, reason: from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public int hashCode() {
        return d(this.value);
    }

    public String toString() {
        return e(this.value);
    }

    private /* synthetic */ t(String str) {
        this.value = str;
    }
}
