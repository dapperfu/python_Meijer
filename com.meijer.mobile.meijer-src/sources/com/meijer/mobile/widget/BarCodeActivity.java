package com.meijer.mobile.widget;

import Eh.AndroidPayLoyaltyCardInfoResponse;
import Nn.AbstractC4216c;
import Vd.AbstractC5516j;
import Zd.C5629b;
import Zd.C5631d;
import Zd.C5634g;
import Zd.l;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.view.C6173t;
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
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J)\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/meijer/mobile/widget/BarCodeActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/widget/MPerksBarcodeView$a;", "<init>", "()V", "", "K1", "LEh/f;", "response", "I1", "(LEh/f;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onStop", "v0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LCh/e;", "s", "LCh/e;", "J1", "()LCh/e;", "setProfileRepository", "(LCh/e;)V", "profileRepository", "", "t", "Z", "isFetchingBarcode", "LJu/a;", "u", "LJu/a;", "disposables", "LNn/c;", "v", "LNn/c;", "binding", "w", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarCodeActivity extends Hilt_BarCodeActivity implements MPerksBarcodeView.a {

    /* renamed from: x, reason: collision with root package name */
    public static final int f120441x = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Ch.e profileRepository;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isFetchingBarcode;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables = new Ju.a();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AbstractC4216c binding;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.widget.BarCodeActivity$loadBarcode$1", f = "BarCodeActivity.kt", l = {92}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f120446a;

        /* renamed from: b, reason: collision with root package name */
        Object f120447b;

        /* renamed from: c, reason: collision with root package name */
        Object f120448c;

        /* renamed from: d, reason: collision with root package name */
        Object f120449d;

        /* renamed from: e, reason: collision with root package name */
        int f120450e;

        /* renamed from: f, reason: collision with root package name */
        int f120451f;

        /* renamed from: g, reason: collision with root package name */
        int f120452g;

        /* renamed from: h, reason: collision with root package name */
        int f120453h;

        /* renamed from: i, reason: collision with root package name */
        int f120454i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f120455j;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = BarCodeActivity.this.new b(continuation);
            bVar.f120455j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f120454i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f120455j;
                    BarCodeActivity barCodeActivity = BarCodeActivity.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.e eVarJ1 = barCodeActivity.J1();
                    this.f120455j = interfaceC15783O;
                    this.f120446a = interfaceC15783O;
                    this.f120447b = this;
                    this.f120448c = this;
                    this.f120449d = interfaceC15783O;
                    this.f120450e = 0;
                    this.f120451f = 0;
                    this.f120452g = 0;
                    this.f120453h = 0;
                    this.f120454i = 1;
                    obj = eVarJ1.j(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getF143270a());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            BarCodeActivity barCodeActivity2 = BarCodeActivity.this;
            AbstractC4216c abstractC4216c = null;
            if (Result.h(objB)) {
                File file = (File) objB;
                AbstractC4216c abstractC4216c2 = barCodeActivity2.binding;
                if (abstractC4216c2 == null) {
                    Intrinsics.x("binding");
                    abstractC4216c2 = null;
                }
                abstractC4216c2.f21821B.setBarcode(file);
            }
            BarCodeActivity barCodeActivity3 = BarCodeActivity.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to load mPerks Barcode", new Object[0]);
                AbstractC4216c abstractC4216c3 = barCodeActivity3.binding;
                if (abstractC4216c3 == null) {
                    Intrinsics.x("binding");
                    abstractC4216c3 = null;
                }
                abstractC4216c3.f21821B.F();
            }
            BarCodeActivity.this.isFetchingBarcode = false;
            AbstractC4216c abstractC4216c4 = BarCodeActivity.this.binding;
            if (abstractC4216c4 == null) {
                Intrinsics.x("binding");
            } else {
                abstractC4216c = abstractC4216c4;
            }
            abstractC4216c.f21821B.setLoading(false);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.widget.BarCodeActivity$onAddToAndroidPay$1", f = "BarCodeActivity.kt", l = {109}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f120457a;

        /* renamed from: b, reason: collision with root package name */
        Object f120458b;

        /* renamed from: c, reason: collision with root package name */
        Object f120459c;

        /* renamed from: d, reason: collision with root package name */
        Object f120460d;

        /* renamed from: e, reason: collision with root package name */
        int f120461e;

        /* renamed from: f, reason: collision with root package name */
        int f120462f;

        /* renamed from: g, reason: collision with root package name */
        int f120463g;

        /* renamed from: h, reason: collision with root package name */
        int f120464h;

        /* renamed from: i, reason: collision with root package name */
        int f120465i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f120466j;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = BarCodeActivity.this.new c(continuation);
            cVar.f120466j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f120465i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f120466j;
                    BarCodeActivity barCodeActivity = BarCodeActivity.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.e eVarJ1 = barCodeActivity.J1();
                    this.f120466j = interfaceC15783O;
                    this.f120457a = interfaceC15783O;
                    this.f120458b = this;
                    this.f120459c = this;
                    this.f120460d = interfaceC15783O;
                    this.f120461e = 0;
                    this.f120462f = 0;
                    this.f120463g = 0;
                    this.f120464h = 0;
                    this.f120465i = 1;
                    obj = eVarJ1.h(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getF143270a());
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
                qw.a.INSTANCE.e(thE);
                new Qj.j(barCodeActivity3, barCodeActivity3.getString(qk.f.f158513k)).g();
                AbstractC4216c abstractC4216c = barCodeActivity3.binding;
                AbstractC4216c abstractC4216c2 = null;
                if (abstractC4216c == null) {
                    Intrinsics.x("binding");
                    abstractC4216c = null;
                }
                abstractC4216c.f21821B.setLoading(false);
                AbstractC4216c abstractC4216c3 = barCodeActivity3.binding;
                if (abstractC4216c3 == null) {
                    Intrinsics.x("binding");
                } else {
                    abstractC4216c2 = abstractC4216c3;
                }
                abstractC4216c2.f21821B.C(true);
            }
            return Unit.f143329a;
        }
    }

    private final void K1() {
        if (this.isFetchingBarcode) {
            return;
        }
        this.isFetchingBarcode = true;
        AbstractC4216c abstractC4216c = this.binding;
        if (abstractC4216c == null) {
            Intrinsics.x("binding");
            abstractC4216c = null;
        }
        abstractC4216c.f21821B.setLoading(true);
        C15809k.d(C6173t.a(this), null, null, new b(null), 3, null);
    }

    public final Ch.e J1() {
        Ch.e eVar = this.profileRepository;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("profileRepository");
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
        AbstractC4216c abstractC4216c = this.binding;
        if (abstractC4216c == null) {
            Intrinsics.x("binding");
            abstractC4216c = null;
        }
        abstractC4216c.f21821B.setLoading(false);
        AbstractC4216c abstractC4216c2 = this.binding;
        if (abstractC4216c2 == null) {
            Intrinsics.x("binding");
            abstractC4216c2 = null;
        }
        abstractC4216c2.f21821B.C(true);
        if (resultCode == -1) {
            Snackbar snackbarQ0 = Snackbar.q0(findViewById(T.f99782Q1), Y.f101169s, -1);
            Zr.a.j(snackbarQ0.K().findViewById(ce.f.f61685P), false, 1, null);
            snackbarQ0.c0();
        } else {
            if (resultCode != 0) {
                androidx.appcompat.app.c cVarG = new Qj.j(this, Y.f101055m5, String.valueOf(resultCode)).g();
                if (cVarG == null || (textView2 = (TextView) cVarG.findViewById(R.id.message)) == null) {
                    return;
                }
                return;
            }
            androidx.appcompat.app.c cVarG2 = new Qj.j(this, getString(Y.f100665S6)).g();
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
    public void v0() {
        AbstractC4216c abstractC4216c = this.binding;
        if (abstractC4216c == null) {
            Intrinsics.x("binding");
            abstractC4216c = null;
        }
        abstractC4216c.f21821B.C(false);
        AbstractC4216c abstractC4216c2 = this.binding;
        if (abstractC4216c2 == null) {
            Intrinsics.x("binding");
            abstractC4216c2 = null;
        }
        abstractC4216c2.f21821B.setLoading(true);
        C15809k.d(C6173t.a(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(AndroidPayLoyaltyCardInfoResponse response) {
        C5634g.a aVarB = C5634g.B();
        String barcodeType = response.getBarcodeType();
        Intrinsics.g(barcodeType);
        C5634g.a aVarD = aVarB.d(barcodeType);
        String barcodeValue = response.getBarcodeValue();
        Intrinsics.g(barcodeValue);
        C5634g.a aVarE = aVarD.e(barcodeValue);
        String accountName = response.getAccountName();
        Intrinsics.g(accountName);
        C5634g.a aVarC = aVarE.c(accountName);
        String accountID = response.getAccountID();
        Intrinsics.g(accountID);
        C5634g.a aVarB2 = aVarC.b(accountID);
        String classID = response.getClassID();
        Intrinsics.g(classID);
        C5634g.a aVarF = aVarB2.f(classID);
        String issuerName = response.getIssuerName();
        Intrinsics.g(issuerName);
        C5634g.a aVarH = aVarF.h(issuerName);
        String programName = response.getProgramName();
        Intrinsics.g(programName);
        C5634g.a aVarI = aVarH.i(programName);
        String objectID = response.getObjectID();
        Intrinsics.g(objectID);
        C5634g c5634gA = aVarI.g(objectID).j(1).a();
        Intrinsics.i(c5634gA, "build(...)");
        C5631d c5631dA = C5631d.B().b(c5634gA).a();
        Intrinsics.i(c5631dA, "build(...)");
        l.a aVarA = new l.a.C0929a().c(1).b(1).a();
        Intrinsics.i(aVarA, "build(...)");
        Zd.m mVarA = Zd.l.a(this, aVarA);
        Intrinsics.i(mVarA, "getWalletObjectsClient(...)");
        AbstractC5516j<C5629b> abstractC5516jP = mVarA.p(c5631dA);
        Intrinsics.i(abstractC5516jP, "createWalletObjects(...)");
        com.google.android.gms.wallet.a.b(abstractC5516jP, this, 435);
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
        AbstractC4216c abstractC4216cM0 = AbstractC4216c.M0(getLayoutInflater());
        this.binding = abstractC4216cM0;
        AbstractC4216c abstractC4216c = null;
        if (abstractC4216cM0 == null) {
            Intrinsics.x("binding");
            abstractC4216cM0 = null;
        }
        setContentView(Zr.a.j(abstractC4216cM0.getRoot(), false, 1, null));
        getWindow().setLayout(-1, -1);
        setTitle("");
        this.isFetchingBarcode = false;
        AbstractC4216c abstractC4216c2 = this.binding;
        if (abstractC4216c2 == null) {
            Intrinsics.x("binding");
            abstractC4216c2 = null;
        }
        abstractC4216c2.f21821B.setListener(this);
        AbstractC4216c abstractC4216c3 = this.binding;
        if (abstractC4216c3 == null) {
            Intrinsics.x("binding");
            abstractC4216c3 = null;
        }
        abstractC4216c3.f21826z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarCodeActivity.L1(this.f120546a, view);
            }
        });
        AbstractC4216c abstractC4216c4 = this.binding;
        if (abstractC4216c4 == null) {
            Intrinsics.x("binding");
            abstractC4216c4 = null;
        }
        abstractC4216c4.f21824E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarCodeActivity.M1(this.f120547a, view);
            }
        });
        AbstractC4216c abstractC4216c5 = this.binding;
        if (abstractC4216c5 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4216c = abstractC4216c5;
        }
        abstractC4216c.f21820A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarCodeActivity.N1(this.f120548a, view);
            }
        });
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        K1();
    }
}
