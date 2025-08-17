package ji;

import Ji.C;
import Ji.LocalThemeScope;
import V0.D1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14794C;
import ji.q1;
import kotlin.C17979v;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;
import r0.RoundedCornerShape;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002!\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0002#$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lji/h;", "", "Lji/q1$d$d;", "h", "(Landroidx/compose/runtime/Composer;I)Lji/q1$d$d;", "LJi/M;", "themeScope", "Lji/q1$j;", "i", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/q1$j;", "Lji/q1$h$b;", "k", "(Landroidx/compose/runtime/Composer;I)Lji/q1$h$b;", "LH1/v;", "f", "()J", "labelSize", "Landroidx/compose/ui/Modifier;", "e", "()Landroidx/compose/ui/Modifier;", "buttonModifier", "j", "labelModifier", "g", "iconModifier", "Lj0/C;", "c", "()Lj0/C;", "contentPadding", "LV0/D1;", "d", "()LV0/D1;", "shape", "b", "a", "Lji/h$a;", "Lji/h$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ji.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
interface InterfaceC14937h {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lji/h$a;", "Lji/h;", "<init>", "()V", "Lr0/h;", "a", "Lr0/h;", "()Lr0/h;", "shape", "b", "Lji/h$a$a;", "Lji/h$a$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.h$a */
    public static abstract class a implements InterfaceC14937h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final RoundedCornerShape shape;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lji/h$a$a;", "Lji/h$a;", "<init>", "()V", "LH1/v;", "c", "J", "f", "()J", "labelSize", "Landroidx/compose/ui/Modifier;", "d", "Landroidx/compose/ui/Modifier;", "e", "()Landroidx/compose/ui/Modifier;", "buttonModifier", "j", "labelModifier", "g", "iconModifier", "Lj0/C;", "Lj0/C;", "()Lj0/C;", "contentPadding", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ji.h$a$a, reason: collision with other inner class name */
        public static final class C2212a extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final C2212a f139831b = new C2212a();

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final long labelSize = H1.w.i(16);

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private static final Modifier buttonModifier;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private static final Modifier labelModifier;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private static final Modifier iconModifier;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private static final InterfaceC14794C contentPadding;

            private C2212a() {
                super(null);
            }

            static {
                Modifier.Companion companion = Modifier.INSTANCE;
                buttonModifier = androidx.compose.foundation.layout.J.o(companion, H1.h.p(48));
                labelModifier = companion;
                iconModifier = androidx.compose.foundation.layout.J.o(companion, H1.h.p(24));
                float f10 = 0;
                contentPadding = androidx.compose.foundation.layout.D.d(H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10));
            }

            @Override // ji.InterfaceC14937h
            public InterfaceC14794C c() {
                return contentPadding;
            }

            @Override // ji.InterfaceC14937h
            public Modifier e() {
                return buttonModifier;
            }

            @Override // ji.InterfaceC14937h
            public long f() {
                return labelSize;
            }

            @Override // ji.InterfaceC14937h
            public Modifier g() {
                return iconModifier;
            }

            @Override // ji.InterfaceC14937h
            public Modifier j() {
                return labelModifier;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lji/h$a$b;", "Lji/h$a;", "<init>", "()V", "LH1/v;", "c", "J", "f", "()J", "labelSize", "Landroidx/compose/ui/Modifier;", "d", "Landroidx/compose/ui/Modifier;", "g", "()Landroidx/compose/ui/Modifier;", "iconModifier", "e", "j", "labelModifier", "buttonModifier", "Lj0/C;", "Lj0/C;", "()Lj0/C;", "contentPadding", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ji.h$a$b */
        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final b f139837b = new b();

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final long labelSize = H1.w.i(14);

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private static final Modifier iconModifier;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private static final Modifier labelModifier;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private static final Modifier buttonModifier;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private static final InterfaceC14794C contentPadding;

            private b() {
                super(null);
            }

            static {
                Modifier.Companion companion = Modifier.INSTANCE;
                iconModifier = androidx.compose.foundation.layout.J.o(companion, H1.h.p(24));
                labelModifier = companion;
                buttonModifier = androidx.compose.foundation.layout.J.o(companion, H1.h.p(40));
                float f10 = 0;
                contentPadding = androidx.compose.foundation.layout.D.d(H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10));
            }

            @Override // ji.InterfaceC14937h
            public InterfaceC14794C c() {
                return contentPadding;
            }

            @Override // ji.InterfaceC14937h
            public Modifier e() {
                return buttonModifier;
            }

            @Override // ji.InterfaceC14937h
            public long f() {
                return labelSize;
            }

            @Override // ji.InterfaceC14937h
            public Modifier g() {
                return iconModifier;
            }

            @Override // ji.InterfaceC14937h
            public Modifier j() {
                return labelModifier;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            this.shape = C16692i.f();
        }

        @Override // ji.InterfaceC14937h
        /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public RoundedCornerShape d() {
            return this.shape;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lji/h$b;", "Lji/h;", "<init>", "()V", "Lr0/h;", "a", "Lr0/h;", "()Lr0/h;", "shape", "b", "c", "Lji/h$b$a;", "Lji/h$b$b;", "Lji/h$b$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ji.h$b */
    public static abstract class b implements InterfaceC14937h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final RoundedCornerShape shape;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0005\u0010\u001c¨\u0006\u001e"}, d2 = {"Lji/h$b$a;", "Lji/h$b;", "<init>", "()V", "Lr0/h;", "c", "Lr0/h;", "a", "()Lr0/h;", "shape", "LH1/v;", "d", "J", "f", "()J", "labelSize", "Landroidx/compose/ui/Modifier;", "e", "Landroidx/compose/ui/Modifier;", "g", "()Landroidx/compose/ui/Modifier;", "iconModifier", "buttonModifier", "j", "labelModifier", "Lj0/C;", "h", "Lj0/C;", "()Lj0/C;", "contentPadding", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ji.h$b$a */
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final a f139844b = new a();

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final RoundedCornerShape shape = C16692i.c(H1.h.p(32));

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private static final long labelSize = H1.w.i(14);

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private static final Modifier iconModifier;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private static final Modifier buttonModifier;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private static final Modifier labelModifier;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            private static final InterfaceC14794C contentPadding;

            private a() {
                super(null);
            }

            static {
                Modifier.Companion companion = Modifier.INSTANCE;
                iconModifier = androidx.compose.foundation.layout.J.o(companion, H1.h.p(24));
                buttonModifier = androidx.compose.foundation.layout.J.F(companion, null, false, 3, null);
                labelModifier = companion;
                contentPadding = androidx.compose.foundation.layout.D.b(H1.h.p(8), H1.h.p(6));
            }

            @Override // ji.InterfaceC14937h.b, ji.InterfaceC14937h
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RoundedCornerShape d() {
                return shape;
            }

            @Override // ji.InterfaceC14937h
            public InterfaceC14794C c() {
                return contentPadding;
            }

            @Override // ji.InterfaceC14937h
            public Modifier e() {
                return buttonModifier;
            }

            @Override // ji.InterfaceC14937h
            public long f() {
                return labelSize;
            }

            @Override // ji.InterfaceC14937h
            public Modifier g() {
                return iconModifier;
            }

            @Override // ji.InterfaceC14937h
            public Modifier j() {
                return labelModifier;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lji/h$b$b;", "Lji/h$b;", "<init>", "()V", "LH1/v;", "c", "J", "f", "()J", "labelSize", "Landroidx/compose/ui/Modifier;", "d", "Landroidx/compose/ui/Modifier;", "g", "()Landroidx/compose/ui/Modifier;", "iconModifier", "e", "buttonModifier", "j", "labelModifier", "Lj0/C;", "Lj0/C;", "()Lj0/C;", "contentPadding", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ji.h$b$b, reason: collision with other inner class name */
        public static final class C2213b extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final C2213b f139851b = new C2213b();

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final long labelSize = H1.w.i(16);

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private static final Modifier iconModifier;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private static final Modifier buttonModifier;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private static final Modifier labelModifier;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private static final InterfaceC14794C contentPadding;

            private C2213b() {
                super(null);
            }

            static {
                Modifier.Companion companion = Modifier.INSTANCE;
                iconModifier = androidx.compose.foundation.layout.J.o(companion, H1.h.p(24));
                buttonModifier = androidx.compose.foundation.layout.J.i(companion, H1.h.p(48));
                labelModifier = companion;
                float f10 = 40;
                float f11 = 13;
                contentPadding = androidx.compose.foundation.layout.D.d(H1.h.p(f10), H1.h.p(f11), H1.h.p(f10), H1.h.p(f11));
            }

            @Override // ji.InterfaceC14937h
            public InterfaceC14794C c() {
                return contentPadding;
            }

            @Override // ji.InterfaceC14937h
            public Modifier e() {
                return buttonModifier;
            }

            @Override // ji.InterfaceC14937h
            public long f() {
                return labelSize;
            }

            @Override // ji.InterfaceC14937h
            public Modifier g() {
                return iconModifier;
            }

            @Override // ji.InterfaceC14937h
            public Modifier j() {
                return labelModifier;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lji/h$b$c;", "Lji/h$b;", "<init>", "()V", "LH1/v;", "c", "J", "f", "()J", "labelSize", "Landroidx/compose/ui/Modifier;", "d", "Landroidx/compose/ui/Modifier;", "g", "()Landroidx/compose/ui/Modifier;", "iconModifier", "e", "buttonModifier", "j", "labelModifier", "Lj0/C;", "Lj0/C;", "()Lj0/C;", "contentPadding", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ji.h$b$c */
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final c f139857b = new c();

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final long labelSize = H1.w.i(16);

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private static final Modifier iconModifier;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private static final Modifier buttonModifier;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private static final Modifier labelModifier;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            private static final InterfaceC14794C contentPadding;

            private c() {
                super(null);
            }

            static {
                Modifier.Companion companion = Modifier.INSTANCE;
                iconModifier = androidx.compose.foundation.layout.J.o(companion, H1.h.p(24));
                float f10 = 40;
                buttonModifier = androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10));
                labelModifier = companion;
                float f11 = 9;
                contentPadding = androidx.compose.foundation.layout.D.d(H1.h.p(f10), H1.h.p(f11), H1.h.p(f10), H1.h.p(f11));
            }

            @Override // ji.InterfaceC14937h
            public InterfaceC14794C c() {
                return contentPadding;
            }

            @Override // ji.InterfaceC14937h
            public Modifier e() {
                return buttonModifier;
            }

            @Override // ji.InterfaceC14937h
            public long f() {
                return labelSize;
            }

            @Override // ji.InterfaceC14937h
            public Modifier g() {
                return iconModifier;
            }

            @Override // ji.InterfaceC14937h
            public Modifier j() {
                return labelModifier;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            this.shape = C16692i.c(H1.h.p(4));
        }

        @Override // ji.InterfaceC14937h
        /* renamed from: a, reason: from getter */
        public RoundedCornerShape d() {
            return this.shape;
        }
    }

    InterfaceC14794C c();

    D1 d();

    Modifier e();

    long f();

    Modifier g();

    Modifier j();

    default q1.Label i(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-84996868);
        if (ComposerKt.M()) {
            ComposerKt.U(-84996868, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Buttons.Anatomy.baseLabel (Button.kt:101)");
        }
        q1.Label label = new q1.Label(j(), null, null, null, 0, false, 0, themeScope.getAdsTypography().getBodyCompact().getOne().d(themeScope.getAdsColors().getAdsColorInverse()).f(FontWeight.INSTANCE.f()).e(f()), null, 382, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return label;
    }

    default q1.d.StandardButton h(Composer composer, int i10) {
        composer.startReplaceGroup(-374574609);
        if (ComposerKt.M()) {
            ComposerKt.U(-374574609, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Buttons.Anatomy.baseButton (Button.kt:89)");
        }
        float f10 = 0;
        q1.d.StandardButton standardButton = new q1.d.StandardButton(false, null, C17979v.f168713a.b(H1.h.p(f10), H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, composer, (C17979v.f168724l << 15) | 438, 24), d(), null, null, c(), e(), false, null, 819, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return standardButton;
    }

    default q1.h.DrawableIcon k(Composer composer, int i10) {
        composer.startReplaceGroup(656342366);
        if (ComposerKt.M()) {
            ComposerKt.U(656342366, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Buttons.Anatomy.baseIcon (Button.kt:110)");
        }
        q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.d.f15495c, null, null, null, 0.0f, null, g(), 62, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return drawableIcon;
    }
}
