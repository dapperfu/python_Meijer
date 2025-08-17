package com.meijer.mobile.meijer.activity.find;

import Mn.AbstractC4273p2;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ou.AbstractC16177a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/i1;", "Lou/a;", "LMn/p2;", "", "suggestion", "originalTerm", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/i1$a;", "", "actionHandler", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "j", "()I", "", "i", "()J", "Landroid/view/View;", "view", "F", "(Landroid/view/View;)LMn/p2;", "viewBinding", "position", "C", "(LMn/p2;I)V", "e", "Ljava/lang/String;", "f", "g", "Lkotlin/jvm/functions/Function1;", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class i1 extends AbstractC16177a<AbstractC4273p2> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String suggestion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String originalTerm;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1<a, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/i1$a;", "", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/meijer/activity/find/i1$a$a;", "Lcom/meijer/mobile/meijer/activity/find/i1$a$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/i1$a$a;", "Lcom/meijer/mobile/meijer/activity/find/i1$a;", "", "suggestion", "originalTerm", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.i1$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class Fill extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String suggestion;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String originalTerm;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Fill)) {
                    return false;
                }
                Fill fill = (Fill) other;
                return Intrinsics.e(this.suggestion, fill.suggestion) && Intrinsics.e(this.originalTerm, fill.originalTerm);
            }

            public int hashCode() {
                return (this.suggestion.hashCode() * 31) + this.originalTerm.hashCode();
            }

            public String toString() {
                return "Fill(suggestion=" + this.suggestion + ", originalTerm=" + this.originalTerm + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fill(String suggestion, String originalTerm) {
                super(null);
                Intrinsics.j(suggestion, "suggestion");
                Intrinsics.j(originalTerm, "originalTerm");
                this.suggestion = suggestion;
                this.originalTerm = originalTerm;
            }

            /* renamed from: a, reason: from getter */
            public final String getOriginalTerm() {
                return this.originalTerm;
            }

            /* renamed from: b, reason: from getter */
            public final String getSuggestion() {
                return this.suggestion;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/i1$a$b;", "Lcom/meijer/mobile/meijer/activity/find/i1$a;", "", "suggestion", "originalTerm", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.i1$a$b, reason: from toString */
        public static final /* data */ class Submit extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String suggestion;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String originalTerm;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Submit)) {
                    return false;
                }
                Submit submit = (Submit) other;
                return Intrinsics.e(this.suggestion, submit.suggestion) && Intrinsics.e(this.originalTerm, submit.originalTerm);
            }

            public int hashCode() {
                return (this.suggestion.hashCode() * 31) + this.originalTerm.hashCode();
            }

            public String toString() {
                return "Submit(suggestion=" + this.suggestion + ", originalTerm=" + this.originalTerm + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Submit(String suggestion, String originalTerm) {
                super(null);
                Intrinsics.j(suggestion, "suggestion");
                Intrinsics.j(originalTerm, "originalTerm");
                this.suggestion = suggestion;
                this.originalTerm = originalTerm;
            }

            /* renamed from: a, reason: from getter */
            public final String getOriginalTerm() {
                return this.originalTerm;
            }

            /* renamed from: b, reason: from getter */
            public final String getSuggestion() {
                return this.suggestion;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1(String suggestion, String originalTerm, Function1<? super a, Unit> actionHandler) {
        Intrinsics.j(suggestion, "suggestion");
        Intrinsics.j(originalTerm, "originalTerm");
        Intrinsics.j(actionHandler, "actionHandler");
        this.suggestion = suggestion;
        this.originalTerm = originalTerm;
        this.actionHandler = actionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(i1 i1Var, View view) {
        i1Var.actionHandler.invoke(new a.Fill(i1Var.suggestion, i1Var.originalTerm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(i1 i1Var, View view) {
        i1Var.actionHandler.invoke(new a.Submit(i1Var.suggestion, i1Var.originalTerm));
    }

    @Override // ou.AbstractC16177a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC4273p2 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        viewBinding.f20854A.setText(Fk.g.f10897a.e(this.suggestion, this.originalTerm));
        viewBinding.f20855z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i1.D(this.f106908a, view);
            }
        });
        viewBinding.f20854A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i1.E(this.f106910a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public AbstractC4273p2 z(View view) {
        Intrinsics.j(view, "view");
        AbstractC4273p2 abstractC4273p2K0 = AbstractC4273p2.K0(view);
        Intrinsics.i(abstractC4273p2K0, "bind(...)");
        return abstractC4273p2K0;
    }

    @Override // nu.h
    public long i() {
        return this.suggestion.hashCode();
    }

    @Override // nu.h
    public int j() {
        return com.meijer.mobile.meijer.V.f99336M0;
    }
}
