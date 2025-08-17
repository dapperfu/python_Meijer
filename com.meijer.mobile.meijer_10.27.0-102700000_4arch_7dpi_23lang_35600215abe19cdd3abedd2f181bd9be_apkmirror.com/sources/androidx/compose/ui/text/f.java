package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u1.InterfaceC17212d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0002\u0005\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/f;", "Landroidx/compose/ui/text/AnnotatedString$a;", "<init>", "()V", "Lu1/d;", "a", "()Lu1/d;", "linkInteractionListener", "Lu1/w;", "b", "()Lu1/w;", "styles", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class f implements AnnotatedString.a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/f$a;", "Landroidx/compose/ui/text/f;", "", "tag", "Lu1/w;", "styles", "Lu1/d;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Lu1/w;Lu1/d;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "Lu1/w;", "()Lu1/w;", "Lu1/d;", "()Lu1/d;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tag;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final u1.w styles;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC17212d linkInteractionListener;

        public a(String str, u1.w wVar, InterfaceC17212d interfaceC17212d) {
            super(null);
            this.tag = str;
            this.styles = wVar;
            this.linkInteractionListener = interfaceC17212d;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Intrinsics.e(this.tag, aVar.tag) && Intrinsics.e(getStyles(), aVar.getStyles()) && Intrinsics.e(getLinkInteractionListener(), aVar.getLinkInteractionListener());
        }

        @Override // androidx.compose.ui.text.f
        /* renamed from: a, reason: from getter */
        public InterfaceC17212d getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.f
        /* renamed from: b, reason: from getter */
        public u1.w getStyles() {
            return this.styles;
        }

        /* renamed from: c, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int iHashCode = this.tag.hashCode() * 31;
            u1.w styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            InterfaceC17212d linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/f$b;", "Landroidx/compose/ui/text/f;", "", "url", "Lu1/w;", "styles", "Lu1/d;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Lu1/w;Lu1/d;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "Lu1/w;", "()Lu1/w;", "Lu1/d;", "()Lu1/d;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final u1.w styles;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC17212d linkInteractionListener;

        public /* synthetic */ b(String str, u1.w wVar, InterfaceC17212d interfaceC17212d, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : wVar, (i10 & 4) != 0 ? null : interfaceC17212d);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.e(this.url, bVar.url) && Intrinsics.e(getStyles(), bVar.getStyles()) && Intrinsics.e(getLinkInteractionListener(), bVar.getLinkInteractionListener());
        }

        public b(String str, u1.w wVar, InterfaceC17212d interfaceC17212d) {
            super(null);
            this.url = str;
            this.styles = wVar;
            this.linkInteractionListener = interfaceC17212d;
        }

        @Override // androidx.compose.ui.text.f
        /* renamed from: a, reason: from getter */
        public InterfaceC17212d getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.f
        /* renamed from: b, reason: from getter */
        public u1.w getStyles() {
            return this.styles;
        }

        /* renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            u1.w styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            InterfaceC17212d linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract InterfaceC17212d getLinkInteractionListener();

    /* renamed from: b */
    public abstract u1.w getStyles();

    private f() {
    }
}
