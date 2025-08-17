package Th;

import Fh.h;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\n\u0012\u000e\u000f\fB-\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LTh/c;", "", "Lak/a;", "header", "body", "buttonText", "", "isVisible", "<init>", "(Lak/a;Lak/a;Lak/a;Z)V", "a", "Lak/a;", "c", "()Lak/a;", "b", "d", "Z", "()Z", "e", "LTh/c$a;", "LTh/c$b;", "LTh/c$c;", "LTh/c$d;", "LTh/c$e;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f34994e = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a header;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a body;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a buttonText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LTh/c$a;", "LTh/c;", "previous", "<init>", "(LTh/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "LTh/c;", "e", "()LTh/c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Th.c$a, reason: from toString */
    public static final /* data */ class Default extends c {

        /* renamed from: g, reason: collision with root package name */
        public static final int f34999g = AbstractC5607a.f45514b;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c previous;

        /* JADX WARN: Multi-variable type inference failed */
        public Default() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && Intrinsics.e(this.previous, ((Default) other).previous);
        }

        public /* synthetic */ Default(c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : cVar);
        }

        /* renamed from: e, reason: from getter */
        public final c getPrevious() {
            return this.previous;
        }

        public int hashCode() {
            c cVar = this.previous;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Default(previous=" + this.previous + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Default(c cVar) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.a(), companion.a(), null, false, 12, null);
            this.previous = cVar;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTh/c$b;", "LTh/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: f, reason: collision with root package name */
        public static final b f35001f = new b();

        /* renamed from: g, reason: collision with root package name */
        public static final int f35002g = AbstractC5607a.f45514b;

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.d(h.f10693f2, new Object[0]), companion.d(h.f10700g2, new Object[0]), null, true, 4, null);
        }

        public String toString() {
            return "MperksPin";
        }

        public int hashCode() {
            return 36564616;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTh/c$c;", "LTh/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Th.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0778c extends c {

        /* renamed from: f, reason: collision with root package name */
        public static final C0778c f35003f = new C0778c();

        /* renamed from: g, reason: collision with root package name */
        public static final int f35004g = AbstractC5607a.f45514b;

        public boolean equals(Object other) {
            return this == other || (other instanceof C0778c);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C0778c() {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.d(h.f10682d5, new Object[0]), companion.d(h.f10689e5, new Object[0]), null, true, 4, null);
        }

        public String toString() {
            return "TextMarketing";
        }

        public int hashCode() {
            return -950171388;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTh/c$d;", "LTh/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: f, reason: collision with root package name */
        public static final d f35005f = new d();

        /* renamed from: g, reason: collision with root package name */
        public static final int f35006g = AbstractC5607a.f45514b;

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private d() {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.d(h.f10577O5, new Object[0]), companion.d(h.f10584P5, new Object[0]), null, true, 4, null);
        }

        public String toString() {
            return "WeeklyAd";
        }

        public int hashCode() {
            return 1010040857;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTh/c$e;", "LTh/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* renamed from: f, reason: collision with root package name */
        public static final e f35007f = new e();

        /* renamed from: g, reason: collision with root package name */
        public static final int f35008g = AbstractC5607a.f45514b;

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private e() {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.d(h.f10640X5, new Object[0]), companion.d(h.f10647Y5, new Object[0]), null, true, 4, null);
        }

        public String toString() {
            return "ZipCode";
        }

        public int hashCode() {
            return 1848747641;
        }
    }

    public /* synthetic */ c(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, abstractC5607a2, abstractC5607a3, z10);
    }

    private c(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10) {
        this.header = abstractC5607a;
        this.body = abstractC5607a2;
        this.buttonText = abstractC5607a3;
        this.isVisible = z10;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getButtonText() {
        return this.buttonText;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getHeader() {
        return this.header;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public /* synthetic */ c(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, abstractC5607a2, (i10 & 4) != 0 ? AbstractC5607a.INSTANCE.d(h.f10648Z, new Object[0]) : abstractC5607a3, (i10 & 8) != 0 ? false : z10, null);
    }
}
