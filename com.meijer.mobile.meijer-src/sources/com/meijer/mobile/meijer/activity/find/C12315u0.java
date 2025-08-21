package com.meijer.mobile.meijer.activity.find;

import Nn.AbstractC4301v2;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.AbstractC15424a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/u0;", "Lku/a;", "LNn/v2;", "", "searchTerm", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/u0$a$a;", "", "actionHandler", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "j", "()I", "", "i", "()J", "Landroid/view/View;", "view", "D", "(Landroid/view/View;)LNn/v2;", "viewBinding", "position", "B", "(LNn/v2;I)V", "e", "Ljava/lang/String;", "f", "Lkotlin/jvm/functions/Function1;", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.u0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12315u0 extends AbstractC15424a<AbstractC4301v2> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String searchTerm;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<a.Submit, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/u0$a;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/meijer/activity/find/u0$a$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.u0$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/u0$a$a;", "Lcom/meijer/mobile/meijer/activity/find/u0$a;", "", "term", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.u0$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class Submit extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String term;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Submit) && Intrinsics.e(this.term, ((Submit) other).term);
            }

            public int hashCode() {
                return this.term.hashCode();
            }

            public String toString() {
                return "Submit(term=" + this.term + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Submit(String term) {
                super(null);
                Intrinsics.j(term, "term");
                this.term = term;
            }

            /* renamed from: a, reason: from getter */
            public final String getTerm() {
                return this.term;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12315u0(String searchTerm, Function1<? super a.Submit, Unit> actionHandler) {
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(actionHandler, "actionHandler");
        this.searchTerm = searchTerm;
        this.actionHandler = actionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(C12315u0 c12315u0, View view) {
        c12315u0.actionHandler.invoke(new a.Submit(c12315u0.searchTerm));
    }

    @Override // ku.AbstractC15424a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC4301v2 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        viewBinding.f22378z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12315u0.C(this.f108720a, view);
            }
        });
        viewBinding.f22377B.setText(this.searchTerm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public AbstractC4301v2 z(View view) {
        Intrinsics.j(view, "view");
        AbstractC4301v2 abstractC4301v2M0 = AbstractC4301v2.M0(view);
        Intrinsics.i(abstractC4301v2M0, "bind(...)");
        return abstractC4301v2M0;
    }

    @Override // ju.h
    public long i() {
        return this.searchTerm.hashCode();
    }

    @Override // ju.h
    public int j() {
        return com.meijer.mobile.meijer.V.f100198P0;
    }
}
