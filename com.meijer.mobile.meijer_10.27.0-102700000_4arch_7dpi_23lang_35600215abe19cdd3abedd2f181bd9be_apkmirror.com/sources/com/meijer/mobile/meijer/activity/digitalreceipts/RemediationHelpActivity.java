package com.meijer.mobile.meijer.activity.digitalreceipts;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/RemediationHelpActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "<init>", "()V", "Lg/a;", "result", "", "H1", "(Lg/a;)V", "M1", "I1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LUj/a;", "r", "LUj/a;", "remediationHelpType", "LMn/O;", "s", "LMn/O;", "binding", "Lg/c;", "Landroid/content/Intent;", "t", "Lg/c;", "enterReceiptLauncher", "Landroidx/appcompat/widget/Toolbar;", "v", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RemediationHelpActivity extends MeijerActivity implements Aj.b {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Uj.a remediationHelpType;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Mn.O binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> enterReceiptLauncher = registerForActivityResult(new h.i(), new a());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a implements InterfaceC14146b, FunctionAdapter {
        a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, RemediationHelpActivity.this, RemediationHelpActivity.class, "handleReceiptResult", "handleReceiptResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            RemediationHelpActivity.this.H1(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(RemediationHelpActivity remediationHelpActivity, View view) {
        remediationHelpActivity.enterReceiptLauncher.a(Al.d.b(remediationHelpActivity, false, 0, 6, null));
    }

    private final void M1() {
        Mn.O o10 = this.binding;
        Mn.O o11 = null;
        if (o10 == null) {
            Intrinsics.y("binding");
            o10 = null;
        }
        TextView textView = o10.f20245H;
        Uj.a aVar = this.remediationHelpType;
        if (aVar == null) {
            Intrinsics.y("remediationHelpType");
            aVar = null;
        }
        textView.setText(aVar.getTitleResourceId());
        Mn.O o12 = this.binding;
        if (o12 == null) {
            Intrinsics.y("binding");
            o12 = null;
        }
        TextView textView2 = o12.f20243F;
        Uj.a aVar2 = this.remediationHelpType;
        if (aVar2 == null) {
            Intrinsics.y("remediationHelpType");
            aVar2 = null;
        }
        textView2.setText(aVar2.getInstructionsResourceId());
        Mn.O o13 = this.binding;
        if (o13 == null) {
            Intrinsics.y("binding");
            o13 = null;
        }
        Button button = o13.f20244G;
        Mn.O o14 = this.binding;
        if (o14 == null) {
            Intrinsics.y("binding");
            o14 = null;
        }
        button.setPaintFlags(o14.f20244G.getPaintFlags() | 8);
        Uj.a aVar3 = this.remediationHelpType;
        if (aVar3 == null) {
            Intrinsics.y("remediationHelpType");
            aVar3 = null;
        }
        if (aVar3.getWalkThroughType() == null) {
            Mn.O o15 = this.binding;
            if (o15 == null) {
                Intrinsics.y("binding");
            } else {
                o11 = o15;
            }
            o11.f20246I.setVisibility(8);
            return;
        }
        Mn.O o16 = this.binding;
        if (o16 == null) {
            Intrinsics.y("binding");
            o16 = null;
        }
        Button button2 = o16.f20246I;
        Uj.a aVar4 = this.remediationHelpType;
        if (aVar4 == null) {
            Intrinsics.y("remediationHelpType");
            aVar4 = null;
        }
        button2.setText(aVar4.getWalkThroughResourceId());
        Mn.O o17 = this.binding;
        if (o17 == null) {
            Intrinsics.y("binding");
            o17 = null;
        }
        Button button3 = o17.f20246I;
        Mn.O o18 = this.binding;
        if (o18 == null) {
            Intrinsics.y("binding");
            o18 = null;
        }
        button3.setPaintFlags(o18.f20246I.getPaintFlags() | 8);
        Mn.O o19 = this.binding;
        if (o19 == null) {
            Intrinsics.y("binding");
        } else {
            o11 = o19;
        }
        o11.f20246I.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemediationHelpActivity.N1(this.f105863a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(RemediationHelpActivity remediationHelpActivity, View view) {
        Intent intent = new Intent();
        Uj.a aVar = remediationHelpActivity.remediationHelpType;
        if (aVar == null) {
            Intrinsics.y("remediationHelpType");
            aVar = null;
        }
        intent.putExtra("com.meijer.intent.extra.REMEDIATION_HELP_TYPE_TAG", aVar.getWalkThroughType());
        remediationHelpActivity.finish();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }

    @Override // Aj.b
    public Toolbar v() {
        Mn.O o10 = this.binding;
        if (o10 == null) {
            Intrinsics.y("binding");
            o10 = null;
        }
        MaterialToolbar appBar = o10.f20247z;
        Intrinsics.i(appBar, "appBar");
        return appBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(C14145a result) {
        if (result.getResultCode() == -1) {
            finish();
        }
    }

    private final void I1() {
        Cl.e meijerIntent = getMeijerIntent();
        String string = getString(com.meijer.mobile.meijer.Y.f100453z5);
        Intrinsics.i(string, "getString(...)");
        startActivity(meijerIntent.o(this, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(RemediationHelpActivity remediationHelpActivity, View view) {
        remediationHelpActivity.I1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(RemediationHelpActivity remediationHelpActivity) {
        if (!remediationHelpActivity.onNavigateUp()) {
            remediationHelpActivity.finish();
        }
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        super.onCreate(savedInstanceState);
        Mn.O oK0 = Mn.O.K0(getLayoutInflater());
        this.binding = oK0;
        Object obj = null;
        if (oK0 == null) {
            Intrinsics.y("binding");
            oK0 = null;
        }
        setContentView(Zr.a.j(oK0.getRoot(), false, 1, null));
        Mn.O o10 = this.binding;
        if (o10 == null) {
            Intrinsics.y("binding");
            o10 = null;
        }
        TextView textView = o10.f20245H;
        Mn.O o11 = this.binding;
        if (o11 == null) {
            Intrinsics.y("binding");
            o11 = null;
        }
        for (TextView textView2 : CollectionsKt.p(textView, o11.f20240C)) {
            Intrinsics.g(textView2);
            zj.c.a(textView2, true);
        }
        Mn.O o12 = this.binding;
        if (o12 == null) {
            Intrinsics.y("binding");
            o12 = null;
        }
        o12.f20244G.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemediationHelpActivity.J1(this.f105860a, view);
            }
        });
        Mn.O o13 = this.binding;
        if (o13 == null) {
            Intrinsics.y("binding");
            o13 = null;
        }
        o13.f20242E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemediationHelpActivity.K1(this.f105861a, view);
            }
        });
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RemediationHelpActivity.L1(this.f105862a);
            }
        }, 3, null);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.REMEDIATION_HELP_TYPE_TAG", Uj.a.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.REMEDIATION_HELP_TYPE_TAG");
            if (serializableExtra2 instanceof Uj.a) {
                obj = serializableExtra2;
            }
            serializableExtra = (Uj.a) obj;
        }
        Uj.a aVar = (Uj.a) serializableExtra;
        if (aVar != null) {
            this.remediationHelpType = aVar;
            M1();
            return;
        }
        throw new IllegalArgumentException("RemediationHelpActivity requires the RemediationHelpType in the Intent passed to it");
    }
}
