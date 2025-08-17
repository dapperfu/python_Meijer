package kotlin;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0012\u0010\r¨\u0006\u0014"}, d2 = {"Li4/o;", "", "Landroid/net/Uri;", "uri", "", "action", "mimeType", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "toString", "()Ljava/lang/String;", "a", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "b", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i4.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14671o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uri uri;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String action;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mimeType;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Li4/o$a;", "", "<init>", "()V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;)Li4/o$a;", "Li4/o;", "a", "()Li4/o;", "Landroid/net/Uri;", "", "Ljava/lang/String;", "action", "c", "mimeType", "d", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.o$a */
    public static final class a {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Uri uri;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String action;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String mimeType;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li4/o$a$a;", "", "<init>", "()V", "Landroid/net/Uri;", "uri", "Li4/o$a;", "a", "(Landroid/net/Uri;)Li4/o$a;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: i4.o$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final a a(Uri uri) {
                Intrinsics.j(uri, "uri");
                a aVar = new a(null);
                aVar.b(uri);
                return aVar;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }

        public final C14671o a() {
            return new C14671o(this.uri, this.action, this.mimeType);
        }

        public final a b(Uri uri) {
            Intrinsics.j(uri, "uri");
            this.uri = uri;
            return this;
        }
    }

    public C14671o(Uri uri, String str, String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14671o(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        Intrinsics.j(intent, "intent");
    }

    /* renamed from: a, reason: from getter */
    public String getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: c, reason: from getter */
    public Uri getUri() {
        return this.uri;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (getUri() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb2.append(" action=");
            sb2.append(getAction());
        }
        if (getMimeType() != null) {
            sb2.append(" mimetype=");
            sb2.append(getMimeType());
        }
        sb2.append(" }");
        String string = sb2.toString();
        Intrinsics.i(string, "sb.toString()");
        return string;
    }
}
