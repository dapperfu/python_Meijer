package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/B;", "Landroidx/compose/ui/text/AnnotatedString$a;", "", "url", "<init>", "(Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.B, reason: from toString */
/* loaded from: classes.dex */
public final class UrlAnnotation implements AnnotatedString.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UrlAnnotation) && Intrinsics.e(this.url, ((UrlAnnotation) other).url);
    }

    /* renamed from: a, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.url + ')';
    }

    public UrlAnnotation(String str) {
        this.url = str;
    }
}
