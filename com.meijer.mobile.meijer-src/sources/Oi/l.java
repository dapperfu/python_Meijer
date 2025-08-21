package Oi;

import M0.SnapshotStateList;
import V0.C5489q0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.text.TextStyle;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u001d\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0006\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u001d%&'()*+,-./0123456789:;<=>?@A¨\u0006B"}, d2 = {"LOi/l;", "", "LOi/m;", "type", "<init>", "(LOi/m;)V", "a", "LOi/m;", "()LOi/m;", "s", "f", "t", "c", "e", "w", "u", "x", "n", "B", "b", "r", "z", "h", "o", "A", "v", "g", "p", "d", "C", "l", "j", "i", "k", "q", "m", "y", "LOi/l$a;", "LOi/l$b;", "LOi/l$c;", "LOi/l$d;", "LOi/l$e;", "LOi/l$f;", "LOi/l$g;", "LOi/l$h;", "LOi/l$i;", "LOi/l$j;", "LOi/l$k;", "LOi/l$l;", "LOi/l$m;", "LOi/l$n;", "LOi/l$o;", "LOi/l$p;", "LOi/l$q;", "LOi/l$r;", "LOi/l$s;", "LOi/l$t;", "LOi/l$u;", "LOi/l$v;", "LOi/l$w;", "LOi/l$x;", "LOi/l$y;", "LOi/l$z;", "LOi/l$A;", "LOi/l$B;", "LOi/l$C;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Oi.m type;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$A;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class A extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final A f24250b = new A();

        public boolean equals(Object other) {
            return this == other || (other instanceof A);
        }

        private A() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "TextAreaState";
        }

        public int hashCode() {
            return -691329990;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$B;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class B extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final B f24251b = new B();

        public boolean equals(Object other) {
            return this == other || (other instanceof B);
        }

        private B() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "TextInput";
        }

        public int hashCode() {
            return -300174592;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"LOi/l$C;", "LOi/l;", "Landroidx/compose/runtime/l0;", "LOi/l$C$a$a;", "exampleContent", "<init>", "(Landroidx/compose/runtime/l0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/runtime/l0;", "a", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$C, reason: from toString */
    public static final /* data */ class TypographyState extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<a.AbstractC0393a> exampleContent;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"LOi/l$C$a;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CHARACTERS", "", "LOi/l$C$a$a;", "()Ljava/util/List;", "OPTIONS", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oi.l$C$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f24253a = new a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ\nabcdefghijklmnopqrstuvwxyz\n0123456789\n!@#$%^&*()_+-=[]{}|;':,.<>/?";

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\u000b\f\tB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LOi/l$C$a$a;", "", "", "name", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "LOi/l$C$a$a$a;", "LOi/l$C$a$a$b;", "LOi/l$C$a$a$c;", "LOi/l$C$a$a$d;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Oi.l$C$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0393a {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String name;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final String content;

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$C$a$a$a;", "LOi/l$C$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Oi.l$C$a$a$a, reason: collision with other inner class name */
                public static final /* data */ class C0394a extends AbstractC0393a {

                    /* renamed from: c, reason: collision with root package name */
                    public static final C0394a f24257c = new C0394a();

                    public boolean equals(Object other) {
                        return this == other || (other instanceof C0394a);
                    }

                    private C0394a() {
                        super("Characters", a.f24253a.a(), null);
                    }

                    public String toString() {
                        return "Characters";
                    }

                    public int hashCode() {
                        return -2102749081;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$C$a$a$b;", "LOi/l$C$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Oi.l$C$a$a$b */
                public static final /* data */ class b extends AbstractC0393a {

                    /* renamed from: c, reason: collision with root package name */
                    public static final b f24258c = new b();

                    public boolean equals(Object other) {
                        return this == other || (other instanceof b);
                    }

                    private b() {
                        super("Heading", "Example Heading", null);
                    }

                    public String toString() {
                        return "Heading";
                    }

                    public int hashCode() {
                        return 569284901;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$C$a$a$c;", "LOi/l$C$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Oi.l$C$a$a$c */
                public static final /* data */ class c extends AbstractC0393a {

                    /* renamed from: c, reason: collision with root package name */
                    public static final c f24259c = new c();

                    public boolean equals(Object other) {
                        return this == other || (other instanceof c);
                    }

                    private c() {
                        super("Paragraph", "Here is some more text to show how this typography style looks when it wraps to multiline. The line heights of each should should be easier to observe this way.", null);
                    }

                    public String toString() {
                        return "Paragraph";
                    }

                    public int hashCode() {
                        return -514021423;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$C$a$a$d;", "LOi/l$C$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Oi.l$C$a$a$d */
                public static final /* data */ class d extends AbstractC0393a {

                    /* renamed from: c, reason: collision with root package name */
                    public static final d f24260c = new d();

                    public boolean equals(Object other) {
                        return this == other || (other instanceof d);
                    }

                    private d() {
                        super("Price", "$12.34", null);
                    }

                    public String toString() {
                        return "Price";
                    }

                    public int hashCode() {
                        return -2060895956;
                    }
                }

                public /* synthetic */ AbstractC0393a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2);
                }

                private AbstractC0393a(String str, String str2) {
                    this.name = str;
                    this.content = str2;
                }

                /* renamed from: a, reason: from getter */
                public final String getContent() {
                    return this.content;
                }

                /* renamed from: b, reason: from getter */
                public final String getName() {
                    return this.name;
                }
            }

            public final List<AbstractC0393a> b() {
                return CollectionsKt.p(AbstractC0393a.C0394a.f24257c, AbstractC0393a.c.f24259c, AbstractC0393a.d.f24260c, AbstractC0393a.b.f24258c);
            }

            public final String a() {
                return CHARACTERS;
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TypographyState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TypographyState) && Intrinsics.e(this.exampleContent, ((TypographyState) other).exampleContent);
        }

        public /* synthetic */ TypographyState(InterfaceC5872l0 interfaceC5872l0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? t1.e(CollectionsKt.s0(a.f24253a.b()), null, 2, null) : interfaceC5872l0);
        }

        public final InterfaceC5872l0<a.AbstractC0393a> b() {
            return this.exampleContent;
        }

        public int hashCode() {
            return this.exampleContent.hashCode();
        }

        public String toString() {
            return "TypographyState(exampleContent=" + this.exampleContent + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypographyState(InterfaceC5872l0<a.AbstractC0393a> exampleContent) {
            super(Oi.m.f24310a, null);
            Intrinsics.j(exampleContent, "exampleContent");
            this.exampleContent = exampleContent;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$a;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$a, reason: case insensitive filesystem */
    public static final /* data */ class C4503a extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final C4503a f24261b = new C4503a();

        public boolean equals(Object other) {
            return this == other || (other instanceof C4503a);
        }

        private C4503a() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "AccordionState";
        }

        public int hashCode() {
            return 784991654;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$b;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$b, reason: case insensitive filesystem */
    public static final /* data */ class C4504b extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final C4504b f24262b = new C4504b();

        public boolean equals(Object other) {
            return this == other || (other instanceof C4504b);
        }

        private C4504b() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "AnnotatedLabelState";
        }

        public int hashCode() {
            return -328384168;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"LOi/l$c;", "LOi/l;", "Landroidx/compose/runtime/l0;", "", "count", "", "enabled", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/runtime/l0;", "setCount", "(Landroidx/compose/runtime/l0;)V", "c", "setEnabled", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$c, reason: case insensitive filesystem and from toString */
    public static final /* data */ class BadgeState extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC5872l0<Integer> count;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC5872l0<Boolean> enabled;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeState)) {
                return false;
            }
            BadgeState badgeState = (BadgeState) other;
            return Intrinsics.e(this.count, badgeState.count) && Intrinsics.e(this.enabled, badgeState.enabled);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BadgeState(InterfaceC5872l0<Integer> count, InterfaceC5872l0<Boolean> enabled) {
            super(Oi.m.f24311b, null);
            Intrinsics.j(count, "count");
            Intrinsics.j(enabled, "enabled");
            this.count = count;
            this.enabled = enabled;
        }

        public final InterfaceC5872l0<Integer> b() {
            return this.count;
        }

        public final InterfaceC5872l0<Boolean> c() {
            return this.enabled;
        }

        public int hashCode() {
            return (this.count.hashCode() * 31) + this.enabled.hashCode();
        }

        public String toString() {
            return "BadgeState(count=" + this.count + ", enabled=" + this.enabled + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$d;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final d f24265b = new d();

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        private d() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "BottomSheetState";
        }

        public int hashCode() {
            return -1916111558;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0006\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"LOi/l$e;", "LOi/l;", "Landroidx/compose/runtime/l0;", "", "hasLabel", "enabled", "isNumber", "hasIcon", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "getHasLabel", "()Landroidx/compose/runtime/l0;", "c", "getEnabled", "d", "e", "getHasIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$e, reason: from toString */
    public static final /* data */ class ButtonState extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Boolean> hasLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Boolean> enabled;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Boolean> isNumber;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Boolean> hasIcon;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) other;
            return Intrinsics.e(this.hasLabel, buttonState.hasLabel) && Intrinsics.e(this.enabled, buttonState.enabled) && Intrinsics.e(this.isNumber, buttonState.isNumber) && Intrinsics.e(this.hasIcon, buttonState.hasIcon);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonState(InterfaceC5872l0<Boolean> hasLabel, InterfaceC5872l0<Boolean> enabled, InterfaceC5872l0<Boolean> isNumber, InterfaceC5872l0<Boolean> hasIcon) {
            super(Oi.m.f24311b, null);
            Intrinsics.j(hasLabel, "hasLabel");
            Intrinsics.j(enabled, "enabled");
            Intrinsics.j(isNumber, "isNumber");
            Intrinsics.j(hasIcon, "hasIcon");
            this.hasLabel = hasLabel;
            this.enabled = enabled;
            this.isNumber = isNumber;
            this.hasIcon = hasIcon;
        }

        public int hashCode() {
            return (((((this.hasLabel.hashCode() * 31) + this.enabled.hashCode()) * 31) + this.isNumber.hashCode()) * 31) + this.hasIcon.hashCode();
        }

        public String toString() {
            return "ButtonState(hasLabel=" + this.hasLabel + ", enabled=" + this.enabled + ", isNumber=" + this.isNumber + ", hasIcon=" + this.hasIcon + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$f;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class f extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final f f24270b = new f();

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        private f() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "CheckboxState";
        }

        public int hashCode() {
            return -558363279;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$g;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class g extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final g f24271b = new g();

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        private g() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "ChipState";
        }

        public int hashCode() {
            return 762473480;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"LOi/l$h;", "LOi/l;", "Landroidx/compose/runtime/l0;", "", "shouldError", "", "loadingDuration", "linkCoupons", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "getShouldError", "()Landroidx/compose/runtime/l0;", "c", "getLoadingDuration", "d", "getLinkCoupons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$h, reason: from toString */
    public static final /* data */ class ClippedCoupon extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Boolean> shouldError;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Integer> loadingDuration;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Boolean> linkCoupons;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClippedCoupon)) {
                return false;
            }
            ClippedCoupon clippedCoupon = (ClippedCoupon) other;
            return Intrinsics.e(this.shouldError, clippedCoupon.shouldError) && Intrinsics.e(this.loadingDuration, clippedCoupon.loadingDuration) && Intrinsics.e(this.linkCoupons, clippedCoupon.linkCoupons);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClippedCoupon(InterfaceC5872l0<Boolean> shouldError, InterfaceC5872l0<Integer> loadingDuration, InterfaceC5872l0<Boolean> linkCoupons) {
            super(Oi.m.f24311b, null);
            Intrinsics.j(shouldError, "shouldError");
            Intrinsics.j(loadingDuration, "loadingDuration");
            Intrinsics.j(linkCoupons, "linkCoupons");
            this.shouldError = shouldError;
            this.loadingDuration = loadingDuration;
            this.linkCoupons = linkCoupons;
        }

        public int hashCode() {
            return (((this.shouldError.hashCode() * 31) + this.loadingDuration.hashCode()) * 31) + this.linkCoupons.hashCode();
        }

        public String toString() {
            return "ClippedCoupon(shouldError=" + this.shouldError + ", loadingDuration=" + this.loadingDuration + ", linkCoupons=" + this.linkCoupons + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$i;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class i extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final i f24275b = new i();

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        private i() {
            super(Oi.m.f24310a, null);
        }

        public String toString() {
            return "ColorAliasState";
        }

        public int hashCode() {
            return -1010081273;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$j;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class j extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final j f24276b = new j();

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        private j() {
            super(Oi.m.f24310a, null);
        }

        public String toString() {
            return "ColorState";
        }

        public int hashCode() {
            return -996869397;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$k;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class k extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final k f24277b = new k();

        public boolean equals(Object other) {
            return this == other || (other instanceof k);
        }

        private k() {
            super(Oi.m.f24310a, null);
        }

        public String toString() {
            return "CornerRadiiState";
        }

        public int hashCode() {
            return 115316750;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOi/l$l;", "LOi/l;", "Landroidx/compose/runtime/l0;", "", "showBounds", "<init>", "(Landroidx/compose/runtime/l0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/runtime/l0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$l, reason: collision with other inner class name and from toString */
    public static final /* data */ class IconsState extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Boolean> showBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public IconsState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IconsState) && Intrinsics.e(this.showBounds, ((IconsState) other).showBounds);
        }

        public /* synthetic */ IconsState(InterfaceC5872l0 interfaceC5872l0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? t1.e(Boolean.FALSE, null, 2, null) : interfaceC5872l0);
        }

        public final InterfaceC5872l0<Boolean> b() {
            return this.showBounds;
        }

        public int hashCode() {
            return this.showBounds.hashCode();
        }

        public String toString() {
            return "IconsState(showBounds=" + this.showBounds + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconsState(InterfaceC5872l0<Boolean> showBounds) {
            super(Oi.m.f24310a, null);
            Intrinsics.j(showBounds, "showBounds");
            this.showBounds = showBounds;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$m;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class m extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final m f24279b = new m();

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        private m() {
            super(Oi.m.f24312c, null);
        }

        public String toString() {
            return "LinkState";
        }

        public int hashCode() {
            return -877499110;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0004\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"LOi/l$n;", "LOi/l;", "Landroidx/compose/runtime/l0;", "", "isLoading", "LCi/o;", "loadingState", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/runtime/l0;", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$n, reason: from toString */
    public static final /* data */ class LoadingState extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Boolean> isLoading;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Ci.o> loadingState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingState)) {
                return false;
            }
            LoadingState loadingState = (LoadingState) other;
            return Intrinsics.e(this.isLoading, loadingState.isLoading) && Intrinsics.e(this.loadingState, loadingState.loadingState);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingState(InterfaceC5872l0<Boolean> isLoading, InterfaceC5872l0<Ci.o> loadingState) {
            super(Oi.m.f24311b, null);
            Intrinsics.j(isLoading, "isLoading");
            Intrinsics.j(loadingState, "loadingState");
            this.isLoading = isLoading;
            this.loadingState = loadingState;
        }

        public final InterfaceC5872l0<Ci.o> b() {
            return this.loadingState;
        }

        public int hashCode() {
            return (this.isLoading.hashCode() * 31) + this.loadingState.hashCode();
        }

        public String toString() {
            return "LoadingState(isLoading=" + this.isLoading + ", loadingState=" + this.loadingState + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$o;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class o extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final o f24282b = new o();

        public boolean equals(Object other) {
            return this == other || (other instanceof o);
        }

        private o() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "ModalState";
        }

        public int hashCode() {
            return 563457505;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$p;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class p extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final p f24283b = new p();

        public boolean equals(Object other) {
            return this == other || (other instanceof p);
        }

        private p() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "Notification";
        }

        public int hashCode() {
            return 13479336;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$q;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class q extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final q f24284b = new q();

        public boolean equals(Object other) {
            return this == other || (other instanceof q);
        }

        private q() {
            super(Oi.m.f24312c, null);
        }

        public String toString() {
            return "ProductCard";
        }

        public int hashCode() {
            return 982940738;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"LOi/l$r;", "LOi/l;", "Landroidx/compose/runtime/l0;", "", "maxValue", "value", "", "maxValueQuantity", "valueQuantity", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/runtime/l0;", "c", "d", "e", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$r, reason: from toString */
    public static final /* data */ class ProgressIndicator extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Double> maxValue;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Double> value;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Integer> maxValueQuantity;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Integer> valueQuantity;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressIndicator)) {
                return false;
            }
            ProgressIndicator progressIndicator = (ProgressIndicator) other;
            return Intrinsics.e(this.maxValue, progressIndicator.maxValue) && Intrinsics.e(this.value, progressIndicator.value) && Intrinsics.e(this.maxValueQuantity, progressIndicator.maxValueQuantity) && Intrinsics.e(this.valueQuantity, progressIndicator.valueQuantity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressIndicator(InterfaceC5872l0<Double> maxValue, InterfaceC5872l0<Double> value, InterfaceC5872l0<Integer> maxValueQuantity, InterfaceC5872l0<Integer> valueQuantity) {
            super(Oi.m.f24311b, null);
            Intrinsics.j(maxValue, "maxValue");
            Intrinsics.j(value, "value");
            Intrinsics.j(maxValueQuantity, "maxValueQuantity");
            Intrinsics.j(valueQuantity, "valueQuantity");
            this.maxValue = maxValue;
            this.value = value;
            this.maxValueQuantity = maxValueQuantity;
            this.valueQuantity = valueQuantity;
        }

        public final InterfaceC5872l0<Double> b() {
            return this.maxValue;
        }

        public final InterfaceC5872l0<Integer> c() {
            return this.maxValueQuantity;
        }

        public final InterfaceC5872l0<Double> d() {
            return this.value;
        }

        public final InterfaceC5872l0<Integer> e() {
            return this.valueQuantity;
        }

        public int hashCode() {
            return (((((this.maxValue.hashCode() * 31) + this.value.hashCode()) * 31) + this.maxValueQuantity.hashCode()) * 31) + this.valueQuantity.hashCode();
        }

        public String toString() {
            return "ProgressIndicator(maxValue=" + this.maxValue + ", value=" + this.value + ", maxValueQuantity=" + this.maxValueQuantity + ", valueQuantity=" + this.valueQuantity + ')';
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR0\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d\"\u0004\b)\u0010\u001fR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010*\u001a\u0004\b\"\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"LOi/l$s;", "LOi/l;", "Landroidx/compose/runtime/l0;", "", "selectedStep", "", "error", "warning", "numbered", "Lkotlin/Function0;", "", "onBackPressed", "allStepsComplete", "LM0/m;", "", "labels", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;LM0/m;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "g", "()Landroidx/compose/runtime/l0;", "setSelectedStep", "(Landroidx/compose/runtime/l0;)V", "c", "setError", "d", "h", "setWarning", "e", "setNumbered", "f", "setOnBackPressed", "setAllStepsComplete", "LM0/m;", "()LM0/m;", "setLabels", "(LM0/m;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$s, reason: from toString */
    public static final /* data */ class ProgressTrackerState extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC5872l0<Integer> selectedStep;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC5872l0<Boolean> error;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC5872l0<Boolean> warning;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC5872l0<Boolean> numbered;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC5872l0<Function0<Unit>> onBackPressed;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC5872l0<Boolean> allStepsComplete;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private SnapshotStateList<String> labels;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressTrackerState)) {
                return false;
            }
            ProgressTrackerState progressTrackerState = (ProgressTrackerState) other;
            return Intrinsics.e(this.selectedStep, progressTrackerState.selectedStep) && Intrinsics.e(this.error, progressTrackerState.error) && Intrinsics.e(this.warning, progressTrackerState.warning) && Intrinsics.e(this.numbered, progressTrackerState.numbered) && Intrinsics.e(this.onBackPressed, progressTrackerState.onBackPressed) && Intrinsics.e(this.allStepsComplete, progressTrackerState.allStepsComplete) && Intrinsics.e(this.labels, progressTrackerState.labels);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressTrackerState(InterfaceC5872l0<Integer> selectedStep, InterfaceC5872l0<Boolean> error, InterfaceC5872l0<Boolean> warning, InterfaceC5872l0<Boolean> numbered, InterfaceC5872l0<Function0<Unit>> onBackPressed, InterfaceC5872l0<Boolean> allStepsComplete, SnapshotStateList<String> labels) {
            super(Oi.m.f24311b, null);
            Intrinsics.j(selectedStep, "selectedStep");
            Intrinsics.j(error, "error");
            Intrinsics.j(warning, "warning");
            Intrinsics.j(numbered, "numbered");
            Intrinsics.j(onBackPressed, "onBackPressed");
            Intrinsics.j(allStepsComplete, "allStepsComplete");
            Intrinsics.j(labels, "labels");
            this.selectedStep = selectedStep;
            this.error = error;
            this.warning = warning;
            this.numbered = numbered;
            this.onBackPressed = onBackPressed;
            this.allStepsComplete = allStepsComplete;
            this.labels = labels;
        }

        public final InterfaceC5872l0<Boolean> b() {
            return this.allStepsComplete;
        }

        public final InterfaceC5872l0<Boolean> c() {
            return this.error;
        }

        public final SnapshotStateList<String> d() {
            return this.labels;
        }

        public final InterfaceC5872l0<Boolean> e() {
            return this.numbered;
        }

        public final InterfaceC5872l0<Function0<Unit>> f() {
            return this.onBackPressed;
        }

        public final InterfaceC5872l0<Integer> g() {
            return this.selectedStep;
        }

        public final InterfaceC5872l0<Boolean> h() {
            return this.warning;
        }

        public int hashCode() {
            return (((((((((((this.selectedStep.hashCode() * 31) + this.error.hashCode()) * 31) + this.warning.hashCode()) * 31) + this.numbered.hashCode()) * 31) + this.onBackPressed.hashCode()) * 31) + this.allStepsComplete.hashCode()) * 31) + this.labels.hashCode();
        }

        public String toString() {
            return "ProgressTrackerState(selectedStep=" + this.selectedStep + ", error=" + this.error + ", warning=" + this.warning + ", numbered=" + this.numbered + ", onBackPressed=" + this.onBackPressed + ", allStepsComplete=" + this.allStepsComplete + ", labels=" + this.labels + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$t;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class t extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final t f24296b = new t();

        public boolean equals(Object other) {
            return this == other || (other instanceof t);
        }

        private t() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "QuantityInputState";
        }

        public int hashCode() {
            return 1234828495;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$u;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class u extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final u f24297b = new u();

        public boolean equals(Object other) {
            return this == other || (other instanceof u);
        }

        private u() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "RadioState";
        }

        public int hashCode() {
            return 2006398291;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001a"}, d2 = {"LOi/l$v;", "LOi/l;", "Landroidx/compose/runtime/l0;", "", "emptyInput", "placeHolder", "standardInput", "alternativeInput", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "c", "()Landroidx/compose/runtime/l0;", "d", "e", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$v, reason: from toString */
    public static final /* data */ class SearchState extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<String> emptyInput;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<String> placeHolder;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<String> standardInput;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<String> alternativeInput;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchState)) {
                return false;
            }
            SearchState searchState = (SearchState) other;
            return Intrinsics.e(this.emptyInput, searchState.emptyInput) && Intrinsics.e(this.placeHolder, searchState.placeHolder) && Intrinsics.e(this.standardInput, searchState.standardInput) && Intrinsics.e(this.alternativeInput, searchState.alternativeInput);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchState(InterfaceC5872l0<String> emptyInput, InterfaceC5872l0<String> placeHolder, InterfaceC5872l0<String> standardInput, InterfaceC5872l0<String> alternativeInput) {
            super(Oi.m.f24311b, null);
            Intrinsics.j(emptyInput, "emptyInput");
            Intrinsics.j(placeHolder, "placeHolder");
            Intrinsics.j(standardInput, "standardInput");
            Intrinsics.j(alternativeInput, "alternativeInput");
            this.emptyInput = emptyInput;
            this.placeHolder = placeHolder;
            this.standardInput = standardInput;
            this.alternativeInput = alternativeInput;
        }

        public final InterfaceC5872l0<String> b() {
            return this.alternativeInput;
        }

        public final InterfaceC5872l0<String> c() {
            return this.emptyInput;
        }

        public final InterfaceC5872l0<String> d() {
            return this.placeHolder;
        }

        public final InterfaceC5872l0<String> e() {
            return this.standardInput;
        }

        public int hashCode() {
            return (((((this.emptyInput.hashCode() * 31) + this.placeHolder.hashCode()) * 31) + this.standardInput.hashCode()) * 31) + this.alternativeInput.hashCode();
        }

        public String toString() {
            return "SearchState(emptyInput=" + this.emptyInput + ", placeHolder=" + this.placeHolder + ", standardInput=" + this.standardInput + ", alternativeInput=" + this.alternativeInput + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$w;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class w extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final w f24302b = new w();

        public boolean equals(Object other) {
            return this == other || (other instanceof w);
        }

        private w() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "SelectableCardState";
        }

        public int hashCode() {
            return 1707865166;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$x;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class x extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final x f24303b = new x();

        public boolean equals(Object other) {
            return this == other || (other instanceof x);
        }

        private x() {
            super(Oi.m.f24311b, null);
        }

        public String toString() {
            return "SwitchState";
        }

        public int hashCode() {
            return 298405216;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOi/l$y;", "LOi/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class y extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final y f24304b = new y();

        public boolean equals(Object other) {
            return this == other || (other instanceof y);
        }

        private y() {
            super(Oi.m.f24312c, null);
        }

        public String toString() {
            return "TabState";
        }

        public int hashCode() {
            return -893610695;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001a¨\u0006#"}, d2 = {"LOi/l$z;", "LOi/l;", "Landroidx/compose/runtime/l0;", "LV0/q0;", "color", "", "label", "textColor", "", BarcodePickDeserializer.FIELD_ICON, "Landroidx/compose/ui/text/z;", "style", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/l0;", "getColor", "()Landroidx/compose/runtime/l0;", "c", "getLabel", "d", "getTextColor", "e", "getIcon", "f", "getStyle", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oi.l$z, reason: from toString */
    public static final /* data */ class TagState extends l {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<C5489q0> color;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<String> label;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<C5489q0> textColor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<Object> icon;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5872l0<TextStyle> style;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagState)) {
                return false;
            }
            TagState tagState = (TagState) other;
            return Intrinsics.e(this.color, tagState.color) && Intrinsics.e(this.label, tagState.label) && Intrinsics.e(this.textColor, tagState.textColor) && Intrinsics.e(this.icon, tagState.icon) && Intrinsics.e(this.style, tagState.style);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TagState(InterfaceC5872l0<C5489q0> color, InterfaceC5872l0<String> label, InterfaceC5872l0<C5489q0> textColor, InterfaceC5872l0<Object> icon, InterfaceC5872l0<TextStyle> style) {
            super(Oi.m.f24311b, null);
            Intrinsics.j(color, "color");
            Intrinsics.j(label, "label");
            Intrinsics.j(textColor, "textColor");
            Intrinsics.j(icon, "icon");
            Intrinsics.j(style, "style");
            this.color = color;
            this.label = label;
            this.textColor = textColor;
            this.icon = icon;
            this.style = style;
        }

        public int hashCode() {
            return (((((((this.color.hashCode() * 31) + this.label.hashCode()) * 31) + this.textColor.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.style.hashCode();
        }

        public String toString() {
            return "TagState(color=" + this.color + ", label=" + this.label + ", textColor=" + this.textColor + ", icon=" + this.icon + ", style=" + this.style + ')';
        }
    }

    public /* synthetic */ l(Oi.m mVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar);
    }

    private l(Oi.m mVar) {
        this.type = mVar;
    }

    /* renamed from: a, reason: from getter */
    public final Oi.m getType() {
        return this.type;
    }
}
