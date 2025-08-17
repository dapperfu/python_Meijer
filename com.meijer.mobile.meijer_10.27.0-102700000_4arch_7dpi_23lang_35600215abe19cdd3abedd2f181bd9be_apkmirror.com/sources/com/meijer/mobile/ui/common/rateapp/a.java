package com.meijer.mobile.ui.common.rateapp;

import Bj.p;
import Lr.d;
import Pj.m;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import gi.InterfaceC14261a;
import hi.AbstractC14481h;
import hi.C14476c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17829a;
import yr.Q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\u001a\u0018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&¨\u0006("}, d2 = {"Lcom/meijer/mobile/ui/common/rateapp/a;", "LLr/d;", "Landroid/content/Context;", "context", "listener", "Lgi/a;", "analyticsEngine", "<init>", "(Landroid/content/Context;LLr/d;Lgi/a;)V", "", "g", "()V", "m", "j", "Lhi/h$a;", "action", "e", "(Lhi/h$a;)V", "f", "onRateAppNow", "onRateAppRemindLater", "onRateAppNoThanks", "onRateAppSendEmail", "onRateAppNoThanksCurrentVersion", "a", "Landroid/content/Context;", "b", "LLr/d;", "c", "Lgi/a;", "Lcom/meijer/mobile/ui/common/rateapp/a$b;", "d", "Lcom/meijer/mobile/ui/common/rateapp/a$b;", "currentState", "LPj/m;", "LPj/m;", "rateDialog", "Lcom/meijer/mobile/ui/common/rateapp/RateAppDialogFragment;", "Lcom/meijer/mobile/ui/common/rateapp/RateAppDialogFragment;", "rateAppDialogFragment", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class a implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final int f119094h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d listener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private b currentState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private m rateDialog;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private RateAppDialogFragment rateAppDialogFragment;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/ui/common/rateapp/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f119101a = new b("INITIAL_DIALOG", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f119102b = new b("RATE_DIALOG", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f119103c = new b("IMPROVE_DIALOG", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f119104d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f119105e;

        private static final /* synthetic */ b[] a() {
            return new b[]{f119101a, f119102b, f119103c};
        }

        static {
            b[] bVarArrA = a();
            f119104d = bVarArrA;
            f119105e = EnumEntriesKt.a(bVarArrA);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f119104d.clone();
        }

        private b(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f119101a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f119102b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f119103c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // Lr.d
    public void onRateAppNoThanks() {
        this.rateAppDialogFragment = null;
        e(C14476c.a("event: rate our app: no thanks"));
        d dVar = this.listener;
        if (dVar != null) {
            dVar.onRateAppNoThanks();
        }
    }

    @Override // Lr.d
    public void onRateAppNow() {
        this.rateAppDialogFragment = null;
        e(C14476c.a("event: rate our app: sure"));
        d dVar = this.listener;
        if (dVar != null) {
            dVar.onRateAppNow();
        }
    }

    @Override // Lr.d
    public void onRateAppRemindLater() {
        this.rateAppDialogFragment = null;
        e(C14476c.a("event: rate our app: remind me later"));
        d dVar = this.listener;
        if (dVar != null) {
            dVar.onRateAppRemindLater();
        }
    }

    public a(Context context, d dVar, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(context, "context");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.context = context;
        this.listener = dVar;
        this.analyticsEngine = analyticsEngine;
        this.currentState = b.f119101a;
    }

    private final void e(AbstractC14481h.Action action) {
        this.analyticsEngine.b(action, C14476c.c("rate meijer"), C14476c.g("rate app"));
    }

    private final void g() {
        if (this.rateDialog == null) {
            m mVarN = new m(this.context, Q.f170972O, new String[0]).f(p.f3061e).r(Q.f170973P, new Object[0]).o(Q.f170999h0, new DialogInterface.OnClickListener() { // from class: Lr.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.meijer.mobile.ui.common.rateapp.a.h(this.f18697a, dialogInterface, i10);
                }
            }).C(Q.f170967J, new DialogInterface.OnClickListener() { // from class: Lr.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.meijer.mobile.ui.common.rateapp.a.i(this.f18698a, dialogInterface, i10);
                }
            }).n();
            mVarN.g();
            this.rateDialog = mVarN;
            this.analyticsEngine.b(C14476c.h("rate app prompt"), C14476c.g("rate app"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a aVar, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        aVar.rateDialog = null;
        aVar.e(C14476c.a("event: how are we doing: yes"));
        aVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(a aVar, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        aVar.rateDialog = null;
        aVar.e(C14476c.a("event: how are we doing: no"));
        aVar.j();
    }

    private final void j() {
        this.currentState = b.f119103c;
        if (this.rateDialog == null) {
            m mVarN = new m(this.context, Q.f170969L, new String[0]).f(p.f3061e).r(Q.f170970M, new Object[0]).o(Q.f170977T, new DialogInterface.OnClickListener() { // from class: Lr.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.meijer.mobile.ui.common.rateapp.a.k(this.f18695a, dialogInterface, i10);
                }
            }).C(Q.f170974Q, new DialogInterface.OnClickListener() { // from class: Lr.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.meijer.mobile.ui.common.rateapp.a.l(this.f18696a, dialogInterface, i10);
                }
            }).n();
            mVarN.g();
            this.rateDialog = mVarN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(a aVar, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        aVar.rateDialog = null;
        aVar.e(C14476c.a("event: how to improve: send email"));
        aVar.onRateAppSendEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        aVar.rateDialog = null;
        aVar.e(C14476c.a("event: how to improve: no thanks"));
        aVar.onRateAppNoThanksCurrentVersion();
    }

    private final void m() {
        this.currentState = b.f119102b;
        RateAppDialogFragment rateAppDialogFragmentA = RateAppDialogFragment.INSTANCE.a();
        rateAppDialogFragmentA.K0(this);
        rateAppDialogFragmentA.setCancelable(false);
        this.rateAppDialogFragment = rateAppDialogFragmentA;
        C17829a c17829a = C17829a.f166179a;
        Context context = this.context;
        Intrinsics.h(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c17829a.a(rateAppDialogFragmentA, (FragmentActivity) context, "RateAppDialogFragment");
    }

    public final void f() {
        int i10 = c.$EnumSwitchMapping$0[this.currentState.ordinal()];
        if (i10 == 1) {
            g();
        } else if (i10 == 2) {
            m();
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j();
        }
    }

    @Override // Lr.d
    public void onRateAppNoThanksCurrentVersion() {
        d dVar = this.listener;
        if (dVar != null) {
            dVar.onRateAppNoThanksCurrentVersion();
        }
    }

    @Override // Lr.d
    public void onRateAppSendEmail() {
        d dVar = this.listener;
        if (dVar != null) {
            dVar.onRateAppSendEmail();
        }
    }
}
