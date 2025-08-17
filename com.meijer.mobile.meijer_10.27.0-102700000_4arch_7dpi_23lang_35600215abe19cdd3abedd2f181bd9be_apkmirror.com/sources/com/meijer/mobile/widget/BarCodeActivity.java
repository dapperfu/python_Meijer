package com.meijer.mobile.widget;

import Dh.AndroidPayLoyaltyCardInfoResponse;
import Mn.AbstractC4211c;
import Td.AbstractC5232j;
import Xd.C5418b;
import Xd.C5420d;
import Xd.C5423g;
import Xd.l;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.view.C6031t;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.widget.MPerksBarcodeView;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J)\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/meijer/mobile/widget/BarCodeActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/widget/MPerksBarcodeView$a;", "<init>", "()V", "", "K1", "LDh/f;", "response", "I1", "(LDh/f;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onStop", "r0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LBh/e;", "s", "LBh/e;", "J1", "()LBh/e;", "setProfileRepository", "(LBh/e;)V", "profileRepository", "", "t", "Z", "isFetchingBarcode", "LNu/a;", "u", "LNu/a;", "disposables", "LMn/c;", "v", "LMn/c;", "binding", "w", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarCodeActivity extends Hilt_BarCodeActivity implements MPerksBarcodeView.a {

    /* renamed from: x, reason: collision with root package name */
    public static final int f119468x = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Bh.e profileRepository;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isFetchingBarcode;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables = new Nu.a();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AbstractC4211c binding;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.widget.BarCodeActivity$loadBarcode$1", f = "BarCodeActivity.kt", l = {92}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f119473a;

        /* renamed from: b, reason: collision with root package name */
        Object f119474b;

        /* renamed from: c, reason: collision with root package name */
        Object f119475c;

        /* renamed from: d, reason: collision with root package name */
        Object f119476d;

        /* renamed from: e, reason: collision with root package name */
        int f119477e;

        /* renamed from: f, reason: collision with root package name */
        int f119478f;

        /* renamed from: g, reason: collision with root package name */
        int f119479g;

        /* renamed from: h, reason: collision with root package name */
        int f119480h;

        /* renamed from: i, reason: collision with root package name */
        int f119481i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f119482j;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = BarCodeActivity.this.new b(continuation);
            bVar.f119482j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f119481i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f119482j;
                    BarCodeActivity barCodeActivity = BarCodeActivity.this;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.e eVarJ1 = barCodeActivity.J1();
                    this.f119482j = interfaceC16622O;
                    this.f119473a = interfaceC16622O;
                    this.f119474b = this;
                    this.f119475c = this;
                    this.f119476d = interfaceC16622O;
                    this.f119477e = 0;
                    this.f119478f = 0;
                    this.f119479g = 0;
                    this.f119480h = 0;
                    this.f119481i = 1;
                    obj = eVarJ1.j(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getF142363a());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            BarCodeActivity barCodeActivity2 = BarCodeActivity.this;
            AbstractC4211c abstractC4211c = null;
            if (Result.h(objB)) {
                File file = (File) objB;
                AbstractC4211c abstractC4211c2 = barCodeActivity2.binding;
                if (abstractC4211c2 == null) {
                    Intrinsics.y("binding");
                    abstractC4211c2 = null;
                }
                abstractC4211c2.f20489B.setBarcode(file);
            }
            BarCodeActivity barCodeActivity3 = BarCodeActivity.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Failed to load mPerks Barcode", new Object[0]);
                AbstractC4211c abstractC4211c3 = barCodeActivity3.binding;
                if (abstractC4211c3 == null) {
                    Intrinsics.y("binding");
                    abstractC4211c3 = null;
                }
                abstractC4211c3.f20489B.F();
            }
            BarCodeActivity.this.isFetchingBarcode = false;
            AbstractC4211c abstractC4211c4 = BarCodeActivity.this.binding;
            if (abstractC4211c4 == null) {
                Intrinsics.y("binding");
            } else {
                abstractC4211c = abstractC4211c4;
            }
            abstractC4211c.f20489B.setLoading(false);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.widget.BarCodeActivity$onAddToAndroidPay$1", f = "BarCodeActivity.kt", l = {109}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f119484a;

        /* renamed from: b, reason: collision with root package name */
        Object f119485b;

        /* renamed from: c, reason: collision with root package name */
        Object f119486c;

        /* renamed from: d, reason: collision with root package name */
        Object f119487d;

        /* renamed from: e, reason: collision with root package name */
        int f119488e;

        /* renamed from: f, reason: collision with root package name */
        int f119489f;

        /* renamed from: g, reason: collision with root package name */
        int f119490g;

        /* renamed from: h, reason: collision with root package name */
        int f119491h;

        /* renamed from: i, reason: collision with root package name */
        int f119492i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f119493j;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = BarCodeActivity.this.new c(continuation);
            cVar.f119493j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f119492i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f119493j;
                    BarCodeActivity barCodeActivity = BarCodeActivity.this;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.e eVarJ1 = barCodeActivity.J1();
                    this.f119493j = interfaceC16622O;
                    this.f119484a = interfaceC16622O;
                    this.f119485b = this;
                    this.f119486c = this;
                    this.f119487d = interfaceC16622O;
                    this.f119488e = 0;
                    this.f119489f = 0;
                    this.f119490g = 0;
                    this.f119491h = 0;
                    this.f119492i = 1;
                    obj = eVarJ1.h(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getF142363a());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            BarCodeActivity barCodeActivity2 = BarCodeActivity.this;
            if (Result.h(objB)) {
                barCodeActivity2.I1((AndroidPayLoyaltyCardInfoResponse) objB);
            }
            BarCodeActivity barCodeActivity3 = BarCodeActivity.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.e(thE);
                new Pj.j(barCodeActivity3, barCodeActivity3.getString(pk.f.f155797k)).g();
                AbstractC4211c abstractC4211c = barCodeActivity3.binding;
                AbstractC4211c abstractC4211c2 = null;
                if (abstractC4211c == null) {
                    Intrinsics.y("binding");
                    abstractC4211c = null;
                }
                abstractC4211c.f20489B.setLoading(false);
                AbstractC4211c abstractC4211c3 = barCodeActivity3.binding;
                if (abstractC4211c3 == null) {
                    Intrinsics.y("binding");
                } else {
                    abstractC4211c2 = abstractC4211c3;
                }
                abstractC4211c2.f20489B.C(true);
            }
            return Unit.f142422a;
        }
    }

    private final void K1() {
        if (this.isFetchingBarcode) {
            return;
        }
        this.isFetchingBarcode = true;
        AbstractC4211c abstractC4211c = this.binding;
        if (abstractC4211c == null) {
            Intrinsics.y("binding");
            abstractC4211c = null;
        }
        abstractC4211c.f20489B.setLoading(true);
        C16648k.d(C6031t.a(this), null, null, new b(null), 3, null);
    }

    public final Bh.e J1() {
        Bh.e eVar = this.profileRepository;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("profileRepository");
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        TextView textView;
        TextView textView2;
        if (requestCode != 435) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        AbstractC4211c abstractC4211c = this.binding;
        if (abstractC4211c == null) {
            Intrinsics.y("binding");
            abstractC4211c = null;
        }
        abstractC4211c.f20489B.setLoading(false);
        AbstractC4211c abstractC4211c2 = this.binding;
        if (abstractC4211c2 == null) {
            Intrinsics.y("binding");
            abstractC4211c2 = null;
        }
        abstractC4211c2.f20489B.C(true);
        if (resultCode == -1) {
            Snackbar snackbarQ0 = Snackbar.q0(findViewById(T.f98926Q1), Y.f100307s, -1);
            Zr.a.j(snackbarQ0.K().findViewById(ae.f.f44670P), false, 1, null);
            snackbarQ0.c0();
        } else {
            if (resultCode != 0) {
                androidx.appcompat.app.c cVarG = new Pj.j(this, Y.f100193m5, String.valueOf(resultCode)).g();
                if (cVarG == null || (textView2 = (TextView) cVarG.findViewById(R.id.message)) == null) {
                    return;
                }
                return;
            }
            androidx.appcompat.app.c cVarG2 = new Pj.j(this, getString(Y.f99746P6)).g();
            if (cVarG2 == null || (textView = (TextView) cVarG2.findViewById(R.id.message)) == null) {
                return;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        this.disposables.d();
        this.isFetchingBarcode = false;
        super.onStop();
    }

    @Override // com.meijer.mobile.widget.MPerksBarcodeView.a
    public void r0() {
        AbstractC4211c abstractC4211c = this.binding;
        if (abstractC4211c == null) {
            Intrinsics.y("binding");
            abstractC4211c = null;
        }
        abstractC4211c.f20489B.C(false);
        AbstractC4211c abstractC4211c2 = this.binding;
        if (abstractC4211c2 == null) {
            Intrinsics.y("binding");
            abstractC4211c2 = null;
        }
        abstractC4211c2.f20489B.setLoading(true);
        C16648k.d(C6031t.a(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(AndroidPayLoyaltyCardInfoResponse response) {
        C5423g.a aVarB = C5423g.B();
        String barcodeType = response.getBarcodeType();
        Intrinsics.g(barcodeType);
        C5423g.a aVarD = aVarB.d(barcodeType);
        String barcodeValue = response.getBarcodeValue();
        Intrinsics.g(barcodeValue);
        C5423g.a aVarE = aVarD.e(barcodeValue);
        String accountName = response.getAccountName();
        Intrinsics.g(accountName);
        C5423g.a aVarC = aVarE.c(accountName);
        String accountID = response.getAccountID();
        Intrinsics.g(accountID);
        C5423g.a aVarB2 = aVarC.b(accountID);
        String classID = response.getClassID();
        Intrinsics.g(classID);
        C5423g.a aVarF = aVarB2.f(classID);
        String issuerName = response.getIssuerName();
        Intrinsics.g(issuerName);
        C5423g.a aVarH = aVarF.h(issuerName);
        String programName = response.getProgramName();
        Intrinsics.g(programName);
        C5423g.a aVarI = aVarH.i(programName);
        String objectID = response.getObjectID();
        Intrinsics.g(objectID);
        C5423g c5423gA = aVarI.g(objectID).j(1).a();
        Intrinsics.i(c5423gA, "build(...)");
        C5420d c5420dA = C5420d.B().b(c5423gA).a();
        Intrinsics.i(c5420dA, "build(...)");
        l.a aVarA = new l.a.C0844a().c(1).b(1).a();
        Intrinsics.i(aVarA, "build(...)");
        Xd.m mVarA = Xd.l.a(this, aVarA);
        Intrinsics.i(mVarA, "getWalletObjectsClient(...)");
        AbstractC5232j<C5418b> abstractC5232jP = mVarA.p(c5420dA);
        Intrinsics.i(abstractC5232jP, "createWalletObjects(...)");
        com.google.android.gms.wallet.a.b(abstractC5232jP, this, 435);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(BarCodeActivity barCodeActivity, View view) {
        barCodeActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(BarCodeActivity barCodeActivity, View view) {
        barCodeActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(BarCodeActivity barCodeActivity, View view) {
        barCodeActivity.finish();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4211c abstractC4211cK0 = AbstractC4211c.K0(getLayoutInflater());
        this.binding = abstractC4211cK0;
        AbstractC4211c abstractC4211c = null;
        if (abstractC4211cK0 == null) {
            Intrinsics.y("binding");
            abstractC4211cK0 = null;
        }
        setContentView(Zr.a.j(abstractC4211cK0.getRoot(), false, 1, null));
        getWindow().setLayout(-1, -1);
        setTitle("");
        this.isFetchingBarcode = false;
        AbstractC4211c abstractC4211c2 = this.binding;
        if (abstractC4211c2 == null) {
            Intrinsics.y("binding");
            abstractC4211c2 = null;
        }
        abstractC4211c2.f20489B.setListener(this);
        AbstractC4211c abstractC4211c3 = this.binding;
        if (abstractC4211c3 == null) {
            Intrinsics.y("binding");
            abstractC4211c3 = null;
        }
        abstractC4211c3.f20494z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarCodeActivity.L1(this.f119573a, view);
            }
        });
        AbstractC4211c abstractC4211c4 = this.binding;
        if (abstractC4211c4 == null) {
            Intrinsics.y("binding");
            abstractC4211c4 = null;
        }
        abstractC4211c4.f20492E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarCodeActivity.M1(this.f119574a, view);
            }
        });
        AbstractC4211c abstractC4211c5 = this.binding;
        if (abstractC4211c5 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4211c = abstractC4211c5;
        }
        abstractC4211c.f20488A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarCodeActivity.N1(this.f119575a, view);
            }
        });
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        K1();
    }
}
