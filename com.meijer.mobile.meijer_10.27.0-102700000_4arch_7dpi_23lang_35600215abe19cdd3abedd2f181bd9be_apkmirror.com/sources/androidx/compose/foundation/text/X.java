package androidx.compose.foundation.text;

import android.view.KeyEvent;
import com.medallia.digital.mobilesdk.l3;
import e1.C13603c;
import e1.C13604d;
import java.util.List;
import kotlin.C17707P;
import kotlin.C17708Q;
import kotlin.C17711U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.C18365k;
import z1.C18368n;
import z1.CommitTextCommand;
import z1.DeleteSurroundingTextCommand;
import z1.InterfaceC18354E;
import z1.InterfaceC18363i;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020\u00162\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b(H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010HR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010IR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010JR\u001a\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/text/X;", "", "Landroidx/compose/foundation/text/B;", "state", "Lw0/Q;", "selectionManager", "Lz1/M;", "value", "", "editable", "singleLine", "Lw0/U;", "preparedSelectionState", "Lz1/E;", "offsetMapping", "Landroidx/compose/foundation/text/s0;", "undoManager", "Landroidx/compose/foundation/text/l;", "keyCombiner", "Landroidx/compose/foundation/text/u;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/text/input/a;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/B;Lw0/Q;Lz1/M;ZZLw0/U;Lz1/E;Landroidx/compose/foundation/text/s0;Landroidx/compose/foundation/text/l;Landroidx/compose/foundation/text/u;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lz1/i;", "e", "(Ljava/util/List;)V", "f", "(Lz1/i;)V", "Le1/b;", "event", "Lz1/a;", "m", "(Landroid/view/KeyEvent;)Lz1/a;", "Lw0/P;", "Lkotlin/ExtensionFunctionType;", "block", "g", "(Lkotlin/jvm/functions/Function1;)V", "l", "(Landroid/view/KeyEvent;)Z", "a", "Landroidx/compose/foundation/text/B;", "j", "()Landroidx/compose/foundation/text/B;", "b", "Lw0/Q;", "h", "()Lw0/Q;", "c", "Lz1/M;", "getValue", "()Lz1/M;", "d", "Z", "getEditable", "()Z", "i", "Lw0/U;", "getPreparedSelectionState", "()Lw0/U;", "Lz1/E;", "getOffsetMapping", "()Lz1/E;", "Landroidx/compose/foundation/text/s0;", "k", "()Landroidx/compose/foundation/text/s0;", "Landroidx/compose/foundation/text/l;", "Landroidx/compose/foundation/text/u;", "Lkotlin/jvm/functions/Function1;", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C17708Q selectionManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextFieldValue value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean editable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C17711U preparedSelectionState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18354E offsetMapping;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s0 undoManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C5680l keyCombiner;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5688u keyMapping;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Function1<TextFieldValue, Unit> onValueChange;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int imeAction;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "it", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49283f = new a();

        a() {
            super(1);
        }

        public final void a(TextFieldValue textFieldValue) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "", "a", "(Lw0/P;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<C17707P, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC5686s f49284f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ X f49285g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f49286h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "", "a", "(Lw0/P;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<C17707P, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f49287f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C17707P c17707p) {
                a(c17707p);
                return Unit.f142422a;
            }

            public final void a(C17707P c17707p) {
                c17707p.A();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "", "a", "(Lw0/P;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.X$b$b, reason: collision with other inner class name */
        static final class C1013b extends Lambda implements Function1<C17707P, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1013b f49288f = new C1013b();

            C1013b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C17707P c17707p) {
                a(c17707p);
                return Unit.f142422a;
            }

            public final void a(C17707P c17707p) {
                c17707p.I();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class c extends Lambda implements Function1<C17707P, InterfaceC18363i> {

            /* renamed from: f, reason: collision with root package name */
            public static final c f49289f = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18363i invoke(C17707P c17707p) {
                return new DeleteSurroundingTextCommand(androidx.compose.ui.text.y.i(c17707p.getSelection()) - c17707p.q(), 0);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class i {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC5686s.values().length];
                try {
                    iArr[EnumC5686s.f49763r.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5686s.f49764s.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5686s.f49765t.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC5686s.f49747b.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC5686s.f49748c.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC5686s.f49750e.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC5686s.f49749d.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC5686s.f49752g.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC5686s.f49751f.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC5686s.f49757l.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC5686s.f49758m.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EnumC5686s.f49759n.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EnumC5686s.f49760o.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[EnumC5686s.f49753h.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[EnumC5686s.f49754i.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[EnumC5686s.f49755j.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[EnumC5686s.f49756k.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[EnumC5686s.f49761p.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[EnumC5686s.f49762q.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[EnumC5686s.f49766u.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[EnumC5686s.f49767v.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[EnumC5686s.f49768w.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[EnumC5686s.f49769x.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[EnumC5686s.f49770y.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[EnumC5686s.f49771z.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[EnumC5686s.f49740S.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[EnumC5686s.f49741T.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[EnumC5686s.f49722A.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[EnumC5686s.f49723B.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[EnumC5686s.f49724C.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[EnumC5686s.f49731J.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[EnumC5686s.f49732K.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[EnumC5686s.f49734M.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[EnumC5686s.f49733L.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[EnumC5686s.f49735N.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[EnumC5686s.f49736O.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[EnumC5686s.f49737P.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[EnumC5686s.f49738Q.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[EnumC5686s.f49725D.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[EnumC5686s.f49726E.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[EnumC5686s.f49727F.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[EnumC5686s.f49728G.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[EnumC5686s.f49729H.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[EnumC5686s.f49730I.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[EnumC5686s.f49739R.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[EnumC5686s.f49742U.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[EnumC5686s.f49743V.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[EnumC5686s.f49744W.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC5686s enumC5686s, X x10, Ref.BooleanRef booleanRef) {
            super(1);
            this.f49284f = enumC5686s;
            this.f49285g = x10;
            this.f49286h = booleanRef;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class d extends Lambda implements Function1<C17707P, InterfaceC18363i> {

            /* renamed from: f, reason: collision with root package name */
            public static final d f49290f = new d();

            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18363i invoke(C17707P c17707p) {
                int iL = c17707p.l();
                if (iL != -1) {
                    return new DeleteSurroundingTextCommand(0, iL - androidx.compose.ui.text.y.i(c17707p.getSelection()));
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class e extends Lambda implements Function1<C17707P, InterfaceC18363i> {

            /* renamed from: f, reason: collision with root package name */
            public static final e f49291f = new e();

            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18363i invoke(C17707P c17707p) {
                Integer numT = c17707p.t();
                if (numT != null) {
                    return new DeleteSurroundingTextCommand(androidx.compose.ui.text.y.i(c17707p.getSelection()) - numT.intValue(), 0);
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class f extends Lambda implements Function1<C17707P, InterfaceC18363i> {

            /* renamed from: f, reason: collision with root package name */
            public static final f f49292f = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18363i invoke(C17707P c17707p) {
                Integer numM = c17707p.m();
                if (numM != null) {
                    return new DeleteSurroundingTextCommand(0, numM.intValue() - androidx.compose.ui.text.y.i(c17707p.getSelection()));
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class g extends Lambda implements Function1<C17707P, InterfaceC18363i> {

            /* renamed from: f, reason: collision with root package name */
            public static final g f49293f = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18363i invoke(C17707P c17707p) {
                Integer numI = c17707p.i();
                if (numI != null) {
                    return new DeleteSurroundingTextCommand(androidx.compose.ui.text.y.i(c17707p.getSelection()) - numI.intValue(), 0);
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class h extends Lambda implements Function1<C17707P, InterfaceC18363i> {

            /* renamed from: f, reason: collision with root package name */
            public static final h f49294f = new h();

            h() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18363i invoke(C17707P c17707p) {
                Integer numF = c17707p.f();
                if (numF != null) {
                    return new DeleteSurroundingTextCommand(0, numF.intValue() - androidx.compose.ui.text.y.i(c17707p.getSelection()));
                }
                return null;
            }
        }

        public final void a(C17707P c17707p) {
            TextFieldValue textFieldValueG;
            TextFieldValue textFieldValueC;
            switch (i.$EnumSwitchMapping$0[this.f49284f.ordinal()]) {
                case 1:
                    this.f49285g.getSelectionManager().q(false);
                    break;
                case 2:
                    this.f49285g.getSelectionManager().Z();
                    break;
                case 3:
                    this.f49285g.getSelectionManager().u();
                    break;
                case 4:
                    c17707p.b(a.f49287f);
                    break;
                case 5:
                    c17707p.c(C1013b.f49288f);
                    break;
                case 6:
                    c17707p.B();
                    break;
                case 7:
                    c17707p.J();
                    break;
                case 8:
                    c17707p.G();
                    break;
                case 9:
                    c17707p.D();
                    break;
                case 10:
                    c17707p.Q();
                    break;
                case 11:
                    c17707p.z();
                    break;
                case 12:
                    c17707p.c0();
                    break;
                case 13:
                    c17707p.b0();
                    break;
                case 14:
                    c17707p.P();
                    break;
                case 15:
                    c17707p.M();
                    break;
                case 16:
                    c17707p.N();
                    break;
                case 17:
                    c17707p.O();
                    break;
                case 18:
                    c17707p.L();
                    break;
                case 19:
                    c17707p.K();
                    break;
                case 20:
                    List<InterfaceC18363i> listY = c17707p.Y(c.f49289f);
                    if (listY != null) {
                        this.f49285g.e(listY);
                        break;
                    }
                    break;
                case 21:
                    List<InterfaceC18363i> listY2 = c17707p.Y(d.f49290f);
                    if (listY2 != null) {
                        this.f49285g.e(listY2);
                        break;
                    }
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    List<InterfaceC18363i> listY3 = c17707p.Y(e.f49291f);
                    if (listY3 != null) {
                        this.f49285g.e(listY3);
                        break;
                    }
                    break;
                case 23:
                    List<InterfaceC18363i> listY4 = c17707p.Y(f.f49292f);
                    if (listY4 != null) {
                        this.f49285g.e(listY4);
                        break;
                    }
                    break;
                case 24:
                    List<InterfaceC18363i> listY5 = c17707p.Y(g.f49293f);
                    if (listY5 != null) {
                        this.f49285g.e(listY5);
                        break;
                    }
                    break;
                case 25:
                    List<InterfaceC18363i> listY6 = c17707p.Y(h.f49294f);
                    if (listY6 != null) {
                        this.f49285g.e(listY6);
                        break;
                    }
                    break;
                case 26:
                    if (!this.f49285g.getSingleLine()) {
                        this.f49285g.f(new CommitTextCommand("\n", 1));
                        break;
                    } else {
                        this.f49285g.getState().n().invoke(androidx.compose.ui.text.input.a.j(this.f49285g.imeAction));
                        break;
                    }
                case 27:
                    if (!this.f49285g.getSingleLine()) {
                        this.f49285g.f(new CommitTextCommand("\t", 1));
                        break;
                    } else {
                        this.f49286h.f142828a = false;
                        break;
                    }
                case 28:
                    c17707p.R();
                    break;
                case 29:
                    c17707p.A().S();
                    break;
                case 30:
                    c17707p.I().S();
                    break;
                case 31:
                    c17707p.B().S();
                    break;
                case l3.f92486e /* 32 */:
                    c17707p.J().S();
                    break;
                case 33:
                    c17707p.G().S();
                    break;
                case 34:
                    c17707p.D().S();
                    break;
                case 35:
                    c17707p.P().S();
                    break;
                case 36:
                    c17707p.M().S();
                    break;
                case 37:
                    c17707p.N().S();
                    break;
                case 38:
                    c17707p.O().S();
                    break;
                case 39:
                    c17707p.Q().S();
                    break;
                case 40:
                    c17707p.z().S();
                    break;
                case 41:
                    c17707p.c0().S();
                    break;
                case 42:
                    c17707p.b0().S();
                    break;
                case 43:
                    c17707p.L().S();
                    break;
                case 44:
                    c17707p.K().S();
                    break;
                case 45:
                    c17707p.d();
                    break;
                case 46:
                    s0 undoManager = this.f49285g.getUndoManager();
                    if (undoManager != null) {
                        undoManager.b(c17707p.Z());
                    }
                    s0 undoManager2 = this.f49285g.getUndoManager();
                    if (undoManager2 != null && (textFieldValueG = undoManager2.g()) != null) {
                        this.f49285g.onValueChange.invoke(textFieldValueG);
                        break;
                    }
                    break;
                case 47:
                    s0 undoManager3 = this.f49285g.getUndoManager();
                    if (undoManager3 != null && (textFieldValueC = undoManager3.c()) != null) {
                        this.f49285g.onValueChange.invoke(textFieldValueC);
                        break;
                    }
                    break;
                case 48:
                    C5687t.b();
                    break;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C17707P c17707p) {
            a(c17707p);
            return Unit.f142422a;
        }
    }

    public /* synthetic */ X(B b10, C17708Q c17708q, TextFieldValue textFieldValue, boolean z10, boolean z11, C17711U c17711u, InterfaceC18354E interfaceC18354E, s0 s0Var, C5680l c5680l, InterfaceC5688u interfaceC5688u, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, c17708q, textFieldValue, z10, z11, c17711u, interfaceC18354E, s0Var, c5680l, interfaceC5688u, function1, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private X(B b10, C17708Q c17708q, TextFieldValue textFieldValue, boolean z10, boolean z11, C17711U c17711u, InterfaceC18354E interfaceC18354E, s0 s0Var, C5680l c5680l, InterfaceC5688u interfaceC5688u, Function1<? super TextFieldValue, Unit> function1, int i10) {
        this.state = b10;
        this.selectionManager = c17708q;
        this.value = textFieldValue;
        this.editable = z10;
        this.singleLine = z11;
        this.preparedSelectionState = c17711u;
        this.offsetMapping = interfaceC18354E;
        this.undoManager = s0Var;
        this.keyCombiner = c5680l;
        this.keyMapping = interfaceC5688u;
        this.onValueChange = function1;
        this.imeAction = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(List<? extends InterfaceC18363i> list) {
        C18365k processor = this.state.getProcessor();
        List<? extends InterfaceC18363i> listM1 = CollectionsKt.m1(list);
        listM1.add(0, new C18368n());
        this.onValueChange.invoke(processor.b(listM1));
    }

    private final void g(Function1<? super C17707P, Unit> block) {
        C17707P c17707p = new C17707P(this.value, this.offsetMapping, this.state.l(), this.preparedSelectionState);
        block.invoke(c17707p);
        if (androidx.compose.ui.text.y.g(c17707p.getSelection(), this.value.getSelection()) && Intrinsics.e(c17707p.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.onValueChange.invoke(c17707p.Z());
    }

    /* renamed from: h, reason: from getter */
    public final C17708Q getSelectionManager() {
        return this.selectionManager;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    /* renamed from: j, reason: from getter */
    public final B getState() {
        return this.state;
    }

    /* renamed from: k, reason: from getter */
    public final s0 getUndoManager() {
        return this.undoManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(InterfaceC18363i interfaceC18363i) {
        e(CollectionsKt.e(interfaceC18363i));
    }

    private final CommitTextCommand m(KeyEvent event) {
        Integer numA;
        if (!Z.a(event) || (numA = this.keyCombiner.a(event)) == null) {
            return null;
        }
        return new CommitTextCommand(J.a(new StringBuilder(), numA.intValue()).toString(), 1);
    }

    public final boolean l(KeyEvent event) {
        EnumC5686s enumC5686sA;
        CommitTextCommand commitTextCommandM = m(event);
        if (commitTextCommandM != null) {
            if (!this.editable) {
                return false;
            }
            f(commitTextCommandM);
            this.preparedSelectionState.b();
            return true;
        }
        if (!C13603c.e(C13604d.b(event), C13603c.INSTANCE.a()) || (enumC5686sA = this.keyMapping.a(event)) == null || (enumC5686sA.getEditsText() && !this.editable)) {
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f142828a = true;
        g(new b(enumC5686sA, this, booleanRef));
        s0 s0Var = this.undoManager;
        if (s0Var != null) {
            s0Var.a();
        }
        return booleanRef.f142828a;
    }

    public /* synthetic */ X(B b10, C17708Q c17708q, TextFieldValue textFieldValue, boolean z10, boolean z11, C17711U c17711u, InterfaceC18354E interfaceC18354E, s0 s0Var, C5680l c5680l, InterfaceC5688u interfaceC5688u, Function1 function1, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, c17708q, (i11 & 4) != 0 ? new TextFieldValue((String) null, 0L, (androidx.compose.ui.text.y) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, c17711u, (i11 & 64) != 0 ? InterfaceC18354E.INSTANCE.a() : interfaceC18354E, (i11 & 128) != 0 ? null : s0Var, c5680l, (i11 & 512) != 0 ? C5690w.a() : interfaceC5688u, (i11 & 1024) != 0 ? a.f49283f : function1, i10, null);
    }
}
