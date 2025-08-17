package i0;

import android.content.ClipData;
import androidx.compose.ui.platform.C5881p0;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li0/a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/p0;", "clipEntry", "Landroidx/compose/ui/text/AnnotatedString;", "b", "(Landroidx/compose/ui/platform/p0;)Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "c", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/platform/p0;", "", "a", "(Landroidx/compose/ui/platform/p0;)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14585a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14585a f136929a = new C14585a();

    @JvmStatic
    public static final boolean a(C5881p0 clipEntry) {
        if (clipEntry == null) {
            return false;
        }
        return clipEntry.getClipData().getDescription().hasMimeType("text/*");
    }

    @JvmStatic
    public static final C5881p0 c(AnnotatedString annotatedString) {
        if (annotatedString == null) {
            return null;
        }
        return new C5881p0(ClipData.newPlainText("plain text", C14586b.b(annotatedString)));
    }

    private C14585a() {
    }

    @JvmStatic
    public static final AnnotatedString b(C5881p0 clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt != null && (text = itemAt.getText()) != null) {
            return C14586b.a(text);
        }
        return null;
    }
}
