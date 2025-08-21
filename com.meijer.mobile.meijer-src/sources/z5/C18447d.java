package z5;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.view.c0;
import com.adobe.marketing.mobile.assurance.internal.B;
import com.adobe.marketing.mobile.assurance.internal.C6548e;
import com.adobe.marketing.mobile.assurance.internal.EnumC6550g;
import com.adobe.marketing.mobile.assurance.internal.EnumC6551h;
import com.adobe.marketing.mobile.assurance.internal.X;
import com.adobe.marketing.mobile.assurance.internal.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import w5.AbstractC17844c;
import z5.AbstractC18444a;

@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u001f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lz5/d;", "Landroidx/lifecycle/c0;", "", "sessionId", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "<init>", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/assurance/internal/h;)V", "pin", "", "n", "(Ljava/lang/String;)V", "Lz5/a;", "action", "p", "(Lz5/a;)V", "a", "Ljava/lang/String;", "b", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "Landroidx/compose/runtime/l0;", "Lz5/c;", "c", "Landroidx/compose/runtime/l0;", "_state", "Landroidx/compose/runtime/z1;", "d", "Landroidx/compose/runtime/z1;", "o", "()Landroidx/compose/runtime/z1;", "state", "z5/d$a", "e", "Lz5/d$a;", "assuranceStatusListener", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: z5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18447d extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC6551h environment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<PinScreenState> _state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z1<PinScreenState> state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a assuranceStatusListener;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"z5/d$a", "Lcom/adobe/marketing/mobile/assurance/internal/B;", "", "a", "()V", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "error", "b", "(Lcom/adobe/marketing/mobile/assurance/internal/g;)V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: z5.d$a */
    public static final class a implements B {
        a() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.B
        public void a() {
            C18447d.this._state.setValue(PinScreenState.b(C18447d.this.o().getValue(), null, AbstractC17844c.a.f166941a, 1, null));
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.B
        public void b(EnumC6550g error) {
            C18447d.this._state.setValue(PinScreenState.b(C18447d.this.o().getValue(), null, new AbstractC17844c.Disconnected(error), 1, null));
        }
    }

    public C18447d(String sessionId, EnumC6551h environment) {
        Intrinsics.j(sessionId, "sessionId");
        Intrinsics.j(environment, "environment");
        this.sessionId = sessionId;
        this.environment = environment;
        InterfaceC5872l0<PinScreenState> interfaceC5872l0E = t1.e(new PinScreenState(null, null, 3, null), null, 2, null);
        this._state = interfaceC5872l0E;
        this.state = interfaceC5872l0E;
        this.assuranceStatusListener = new a();
    }

    private final void n(String pin) {
        Y yB = C6548e.f63072a.b();
        if (StringsKt.s0(this.sessionId)) {
            this._state.setValue(PinScreenState.b(this.state.getValue(), null, new AbstractC17844c.Disconnected(EnumC6550g.UNEXPECTED_ERROR), 1, null));
            return;
        }
        if (yB != null) {
            yB.b(this.sessionId, pin, this.environment, this.assuranceStatusListener, X.PIN);
        }
        this._state.setValue(PinScreenState.b(this.state.getValue(), null, AbstractC17844c.b.f166942a, 1, null));
    }

    public final z1<PinScreenState> o() {
        return this.state;
    }

    public final void p(AbstractC18444a action) {
        Intrinsics.j(action, "action");
        String pin = this.state.getValue().getPin();
        if (action instanceof AbstractC18444a.Number) {
            if (pin.length() >= 4) {
                return;
            }
            this._state.setValue(PinScreenState.b(this.state.getValue(), pin + ((AbstractC18444a.Number) action).getNumber(), null, 2, null));
            return;
        }
        if (action instanceof AbstractC18444a.c) {
            if (StringsKt.s0(pin)) {
                return;
            }
            this._state.setValue(PinScreenState.b(this.state.getValue(), StringsKt.J1(pin, 1), null, 2, null));
        } else {
            if (action instanceof AbstractC18444a.Connect) {
                n(((AbstractC18444a.Connect) action).getNumber());
                return;
            }
            if (!(action instanceof AbstractC18444a.C2782a)) {
                if (action instanceof AbstractC18444a.e) {
                    this._state.setValue(new PinScreenState(null, null, 3, null));
                }
            } else {
                Y yB = C6548e.f63072a.b();
                if (yB != null) {
                    yB.a();
                }
            }
        }
    }
}
