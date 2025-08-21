package com.meijer.mobile.ui.common.rateapp;

import Cj.p;
import Lr.d;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c;
import com.meijer.mobile.core.base.ui.dialogfragment.MeijerDialogFragment;
import com.meijer.mobile.ui.common.rateapp.RateAppDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yr.Q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/ui/common/rateapp/RateAppDialogFragment;", "Lcom/meijer/mobile/core/base/ui/dialogfragment/MeijerDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "LLr/d;", "a", "LLr/d;", "getListener", "()LLr/d;", "L0", "(LLr/d;)V", "listener", "b", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RateAppDialogFragment extends MeijerDialogFragment {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f120064c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d listener;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/ui/common/rateapp/RateAppDialogFragment$a;", "", "<init>", "()V", "Lcom/meijer/mobile/ui/common/rateapp/RateAppDialogFragment;", "a", "()Lcom/meijer/mobile/ui/common/rateapp/RateAppDialogFragment;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.ui.common.rateapp.RateAppDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RateAppDialogFragment a() {
            return new RateAppDialogFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(RateAppDialogFragment rateAppDialogFragment, DialogInterface dialogInterface, int i10) {
        d dVar = rateAppDialogFragment.listener;
        if (dVar != null) {
            dVar.onRateAppNow();
        }
        rateAppDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(RateAppDialogFragment rateAppDialogFragment, DialogInterface dialogInterface, int i10) {
        d dVar = rateAppDialogFragment.listener;
        if (dVar != null) {
            dVar.onRateAppNoThanks();
        }
        rateAppDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(RateAppDialogFragment rateAppDialogFragment, DialogInterface dialogInterface, int i10) {
        d dVar = rateAppDialogFragment.listener;
        if (dVar != null) {
            dVar.onRateAppRemindLater();
        }
        rateAppDialogFragment.dismiss();
    }

    public final void L0(d dVar) {
        this.listener = dVar;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        c cVarCreate = new c.a(requireActivity(), p.f5106e).setTitle(Q.f171746N).setMessage(Q.f171743K).setPositiveButton(Q.f171750R, new DialogInterface.OnClickListener() { // from class: Lr.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                RateAppDialogFragment.H0(this.f19436a, dialogInterface, i10);
            }
        }).setNegativeButton(Q.f171749Q, new DialogInterface.OnClickListener() { // from class: Lr.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                RateAppDialogFragment.J0(this.f19437a, dialogInterface, i10);
            }
        }).setNeutralButton(Q.f171751S, new DialogInterface.OnClickListener() { // from class: Lr.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                RateAppDialogFragment.K0(this.f19438a, dialogInterface, i10);
            }
        }).create();
        Intrinsics.i(cVarCreate, "create(...)");
        return cVarCreate;
    }
}
