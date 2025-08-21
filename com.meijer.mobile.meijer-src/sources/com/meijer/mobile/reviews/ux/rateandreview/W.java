package com.meijer.mobile.reviews.ux.rateandreview;

import Gp.ProductInfoForReviewSubmit;
import Kp.ProductReviewSubmitRequest;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6157f;
import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0006$\u0010\u0014\f\u001b\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LKp/g;", "bazaarVoiceManager", "<init>", "(LKp/g;)V", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "action", "", "r", "(Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;)V", "a", "LKp/g;", "Lpv/B;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$f;", "b", "Lpv/B;", "_viewState", "Lpv/P;", "c", "Lpv/P;", "q", "()Lpv/P;", "viewState", "Lpv/A;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$d;", "d", "Lpv/A;", "_eventFlow", "Lpv/F;", "e", "Lpv/F;", "p", "()Lpv/F;", "eventFlow", "f", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class W extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Kp.g bazaarVoiceManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<d> _eventFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<d> eventFlow;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "<init>", "()V", "p", "g", "m", "n", "o", "k", "i", "j", "q", "c", "l", "e", "h", "b", "a", "f", "d", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$a;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$b;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$c;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$d;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$e;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$f;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$g;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$h;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$i;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$j;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$k;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$l;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$m;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$n;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$o;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$p;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$q;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$a;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "shouldPromptUser", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class CameraPermissionDeniedAction extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldPromptUser;

            public CameraPermissionDeniedAction(boolean z10) {
                super(null);
                this.shouldPromptUser = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CameraPermissionDeniedAction) && this.shouldPromptUser == ((CameraPermissionDeniedAction) other).shouldPromptUser;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldPromptUser);
            }

            public String toString() {
                return "CameraPermissionDeniedAction(shouldPromptUser=" + this.shouldPromptUser + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getShouldPromptUser() {
                return this.shouldPromptUser;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$b;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f117086a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1943914719;
            }

            public String toString() {
                return "DismissModalAction";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$c;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "checkedIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$c, reason: from toString */
        public static final /* data */ class OnUpdateRecommendationsStatus extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int checkedIndex;

            public OnUpdateRecommendationsStatus(int i10) {
                super(null);
                this.checkedIndex = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnUpdateRecommendationsStatus) && this.checkedIndex == ((OnUpdateRecommendationsStatus) other).checkedIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.checkedIndex);
            }

            public String toString() {
                return "OnUpdateRecommendationsStatus(checkedIndex=" + this.checkedIndex + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getCheckedIndex() {
                return this.checkedIndex;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$d;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "Landroid/net/Uri;", "pickedPhotos", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$d, reason: from toString */
        public static final /* data */ class PickSelectedPhotosAction extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Uri> pickedPhotos;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PickSelectedPhotosAction) && Intrinsics.e(this.pickedPhotos, ((PickSelectedPhotosAction) other).pickedPhotos);
            }

            public int hashCode() {
                return this.pickedPhotos.hashCode();
            }

            public String toString() {
                return "PickSelectedPhotosAction(pickedPhotos=" + this.pickedPhotos + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public PickSelectedPhotosAction(List<? extends Uri> pickedPhotos) {
                super(null);
                Intrinsics.j(pickedPhotos, "pickedPhotos");
                this.pickedPhotos = pickedPhotos;
            }

            public final List<Uri> a() {
                return this.pickedPhotos;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$e;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f117089a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1585910850;
            }

            public String toString() {
                return "RemoveSelectedPhotosAction";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$f;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "activeBottomSheet", "<init>", "(Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "()Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$f, reason: from toString */
        public static final /* data */ class SetActiveBottomSheetAction extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b activeBottomSheet;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetActiveBottomSheetAction) && Intrinsics.e(this.activeBottomSheet, ((SetActiveBottomSheetAction) other).activeBottomSheet);
            }

            public int hashCode() {
                return this.activeBottomSheet.hashCode();
            }

            public String toString() {
                return "SetActiveBottomSheetAction(activeBottomSheet=" + this.activeBottomSheet + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetActiveBottomSheetAction(b activeBottomSheet) {
                super(null);
                Intrinsics.j(activeBottomSheet, "activeBottomSheet");
                this.activeBottomSheet = activeBottomSheet;
            }

            /* renamed from: a, reason: from getter */
            public final b getActiveBottomSheet() {
                return this.activeBottomSheet;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$g;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "LGp/a;", "productInfo", "<init>", "(LGp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGp/a;", "()LGp/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$g, reason: from toString */
        public static final /* data */ class SetProductInfo extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductInfoForReviewSubmit productInfo;

            public SetProductInfo(ProductInfoForReviewSubmit productInfoForReviewSubmit) {
                super(null);
                this.productInfo = productInfoForReviewSubmit;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetProductInfo) && Intrinsics.e(this.productInfo, ((SetProductInfo) other).productInfo);
            }

            public int hashCode() {
                ProductInfoForReviewSubmit productInfoForReviewSubmit = this.productInfo;
                if (productInfoForReviewSubmit == null) {
                    return 0;
                }
                return productInfoForReviewSubmit.hashCode();
            }

            public String toString() {
                return "SetProductInfo(productInfo=" + this.productInfo + ')';
            }

            /* renamed from: a, reason: from getter */
            public final ProductInfoForReviewSubmit getProductInfo() {
                return this.productInfo;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$h;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final h f117092a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 1019485358;
            }

            public String toString() {
                return "SubmitReviewAction";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$i;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "inputString", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$i, reason: from toString */
        public static final /* data */ class UpdateEmailInputString extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inputString;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateEmailInputString) && Intrinsics.e(this.inputString, ((UpdateEmailInputString) other).inputString);
            }

            public int hashCode() {
                return this.inputString.hashCode();
            }

            public String toString() {
                return "UpdateEmailInputString(inputString=" + this.inputString + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateEmailInputString(String inputString) {
                super(null);
                Intrinsics.j(inputString, "inputString");
                this.inputString = inputString;
            }

            /* renamed from: a, reason: from getter */
            public final String getInputString() {
                return this.inputString;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$j;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "inputString", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$j, reason: from toString */
        public static final /* data */ class UpdateLocationInputString extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inputString;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateLocationInputString) && Intrinsics.e(this.inputString, ((UpdateLocationInputString) other).inputString);
            }

            public int hashCode() {
                return this.inputString.hashCode();
            }

            public String toString() {
                return "UpdateLocationInputString(inputString=" + this.inputString + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateLocationInputString(String inputString) {
                super(null);
                Intrinsics.j(inputString, "inputString");
                this.inputString = inputString;
            }

            /* renamed from: a, reason: from getter */
            public final String getInputString() {
                return this.inputString;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$k;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "inputString", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$k, reason: from toString */
        public static final /* data */ class UpdateNameInputString extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inputString;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateNameInputString) && Intrinsics.e(this.inputString, ((UpdateNameInputString) other).inputString);
            }

            public int hashCode() {
                return this.inputString.hashCode();
            }

            public String toString() {
                return "UpdateNameInputString(inputString=" + this.inputString + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateNameInputString(String inputString) {
                super(null);
                Intrinsics.j(inputString, "inputString");
                this.inputString = inputString;
            }

            /* renamed from: a, reason: from getter */
            public final String getInputString() {
                return this.inputString;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$l;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "Landroid/net/Uri;", "photo", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$l, reason: from toString */
        public static final /* data */ class UpdatePhotoListAction extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Uri photo;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdatePhotoListAction) && Intrinsics.e(this.photo, ((UpdatePhotoListAction) other).photo);
            }

            public int hashCode() {
                return this.photo.hashCode();
            }

            public String toString() {
                return "UpdatePhotoListAction(photo=" + this.photo + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatePhotoListAction(Uri photo) {
                super(null);
                Intrinsics.j(photo, "photo");
                this.photo = photo;
            }

            /* renamed from: a, reason: from getter */
            public final Uri getPhoto() {
                return this.photo;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$m;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "rateNumber", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$m, reason: from toString */
        public static final /* data */ class UpdateRateNumber extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int rateNumber;

            public UpdateRateNumber(int i10) {
                super(null);
                this.rateNumber = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateRateNumber) && this.rateNumber == ((UpdateRateNumber) other).rateNumber;
            }

            public int hashCode() {
                return Integer.hashCode(this.rateNumber);
            }

            public String toString() {
                return "UpdateRateNumber(rateNumber=" + this.rateNumber + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getRateNumber() {
                return this.rateNumber;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$n;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "inputString", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$n, reason: from toString */
        public static final /* data */ class UpdateReviewInputString extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inputString;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateReviewInputString) && Intrinsics.e(this.inputString, ((UpdateReviewInputString) other).inputString);
            }

            public int hashCode() {
                return this.inputString.hashCode();
            }

            public String toString() {
                return "UpdateReviewInputString(inputString=" + this.inputString + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateReviewInputString(String inputString) {
                super(null);
                Intrinsics.j(inputString, "inputString");
                this.inputString = inputString;
            }

            /* renamed from: a, reason: from getter */
            public final String getInputString() {
                return this.inputString;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$o;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "inputString", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$o, reason: from toString */
        public static final /* data */ class UpdateReviewTitleInputString extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inputString;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateReviewTitleInputString) && Intrinsics.e(this.inputString, ((UpdateReviewTitleInputString) other).inputString);
            }

            public int hashCode() {
                return this.inputString.hashCode();
            }

            public String toString() {
                return "UpdateReviewTitleInputString(inputString=" + this.inputString + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateReviewTitleInputString(String inputString) {
                super(null);
                Intrinsics.j(inputString, "inputString");
                this.inputString = inputString;
            }

            /* renamed from: a, reason: from getter */
            public final String getInputString() {
                return this.inputString;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$p;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final p f117100a = new p();

            private p() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public int hashCode() {
                return -924770919;
            }

            public String toString() {
                return "UpdateShouldShowErrorStatus";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$a$q;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$a;", "", "isChecked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$a$q, reason: from toString */
        public static final /* data */ class UpdateTermsCheckedStatus extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isChecked;

            public UpdateTermsCheckedStatus(boolean z10) {
                super(null);
                this.isChecked = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateTermsCheckedStatus) && this.isChecked == ((UpdateTermsCheckedStatus) other).isChecked;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isChecked);
            }

            public String toString() {
                return "UpdateTermsCheckedStatus(isChecked=" + this.isChecked + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "", "<init>", "()V", "c", "b", "a", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b$a;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b$b;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$b$a;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f117102a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 792863813;
            }

            public String toString() {
                return "PhotoGuidelines";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$b$b;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1876b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1876b f117103a = new C1876b();

            private C1876b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1876b);
            }

            public int hashCode() {
                return -827529717;
            }

            public String toString() {
                return "ReviewGuidelines";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$b$c;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f117104a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 843268856;
            }

            public String toString() {
                return "TakePhotos";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$c;", "", "", "bodyLabel", "actionLabel", "", "shouldPromptUser", "<init>", "(IIZ)V", "a", "(IIZ)Lcom/meijer/mobile/reviews/ux/rateandreview/W$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "c", "Z", "e", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$c, reason: from toString */
    public static final /* data */ class CameraPermissionToast {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int bodyLabel;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int actionLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldPromptUser;

        public static /* synthetic */ CameraPermissionToast b(CameraPermissionToast cameraPermissionToast, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = cameraPermissionToast.bodyLabel;
            }
            if ((i12 & 2) != 0) {
                i11 = cameraPermissionToast.actionLabel;
            }
            if ((i12 & 4) != 0) {
                z10 = cameraPermissionToast.shouldPromptUser;
            }
            return cameraPermissionToast.a(i10, i11, z10);
        }

        public final CameraPermissionToast a(int bodyLabel, int actionLabel, boolean shouldPromptUser) {
            return new CameraPermissionToast(bodyLabel, actionLabel, shouldPromptUser);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraPermissionToast)) {
                return false;
            }
            CameraPermissionToast cameraPermissionToast = (CameraPermissionToast) other;
            return this.bodyLabel == cameraPermissionToast.bodyLabel && this.actionLabel == cameraPermissionToast.actionLabel && this.shouldPromptUser == cameraPermissionToast.shouldPromptUser;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.bodyLabel) * 31) + Integer.hashCode(this.actionLabel)) * 31) + Boolean.hashCode(this.shouldPromptUser);
        }

        public String toString() {
            return "CameraPermissionToast(bodyLabel=" + this.bodyLabel + ", actionLabel=" + this.actionLabel + ", shouldPromptUser=" + this.shouldPromptUser + ')';
        }

        /* renamed from: c, reason: from getter */
        public final int getActionLabel() {
            return this.actionLabel;
        }

        /* renamed from: d, reason: from getter */
        public final int getBodyLabel() {
            return this.bodyLabel;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getShouldPromptUser() {
            return this.shouldPromptUser;
        }

        public CameraPermissionToast(int i10, int i11, boolean z10) {
            this.bodyLabel = i10;
            this.actionLabel = i11;
            this.shouldPromptUser = z10;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$d;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$d$a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$d$a;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final a f117108a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1238291211;
            }

            public String toString() {
                return "SubmitReviewSuccessEvent";
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$e;", "", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$e$a;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$e$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$e$a;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$e;", "Lbk/a;", "errorMessage", "<init>", "(Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$e$a, reason: from toString */
        public static final /* data */ class ErrorModal extends e {

            /* renamed from: b, reason: collision with root package name */
            public static final int f117109b = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a errorMessage;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorModal) && Intrinsics.e(this.errorMessage, ((ErrorModal) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public String toString() {
                return "ErrorModal(errorMessage=" + this.errorMessage + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorModal(AbstractC6392a errorMessage) {
                super(null);
                Intrinsics.j(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC6392a getErrorMessage() {
                return this.errorMessage;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$e$b;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f117111a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1765850898;
            }

            public String toString() {
                return "None";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b \u0010(¨\u0006)"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/W$f;", "", "Lcom/meijer/mobile/reviews/ux/rateandreview/a0;", "rateAndReviewDecorator", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$e;", "modalState", "", "isLoading", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$c;", "cameraPermissionNeededToast", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "activeBottomSheet", "<init>", "(Lcom/meijer/mobile/reviews/ux/rateandreview/a0;Lcom/meijer/mobile/reviews/ux/rateandreview/W$e;ZLcom/meijer/mobile/reviews/ux/rateandreview/W$c;Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;)V", "a", "(Lcom/meijer/mobile/reviews/ux/rateandreview/a0;Lcom/meijer/mobile/reviews/ux/rateandreview/W$e;ZLcom/meijer/mobile/reviews/ux/rateandreview/W$c;Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;)Lcom/meijer/mobile/reviews/ux/rateandreview/W$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/reviews/ux/rateandreview/a0;", "f", "()Lcom/meijer/mobile/reviews/ux/rateandreview/a0;", "b", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$e;", "e", "()Lcom/meijer/mobile/reviews/ux/rateandreview/W$e;", "c", "Z", "g", "()Z", "d", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$c;", "()Lcom/meijer/mobile/reviews/ux/rateandreview/W$c;", "Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "()Lcom/meijer/mobile/reviews/ux/rateandreview/W$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.W$f, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RateAndReviewDecorator rateAndReviewDecorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final e modalState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CameraPermissionToast cameraPermissionNeededToast;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final b activeBottomSheet;

        public ViewState(RateAndReviewDecorator rateAndReviewDecorator, e modalState, boolean z10, CameraPermissionToast cameraPermissionToast, b bVar) {
            Intrinsics.j(rateAndReviewDecorator, "rateAndReviewDecorator");
            Intrinsics.j(modalState, "modalState");
            this.rateAndReviewDecorator = rateAndReviewDecorator;
            this.modalState = modalState;
            this.isLoading = z10;
            this.cameraPermissionNeededToast = cameraPermissionToast;
            this.activeBottomSheet = bVar;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, RateAndReviewDecorator rateAndReviewDecorator, e eVar, boolean z10, CameraPermissionToast cameraPermissionToast, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rateAndReviewDecorator = viewState.rateAndReviewDecorator;
            }
            if ((i10 & 2) != 0) {
                eVar = viewState.modalState;
            }
            if ((i10 & 4) != 0) {
                z10 = viewState.isLoading;
            }
            if ((i10 & 8) != 0) {
                cameraPermissionToast = viewState.cameraPermissionNeededToast;
            }
            if ((i10 & 16) != 0) {
                bVar = viewState.activeBottomSheet;
            }
            b bVar2 = bVar;
            boolean z11 = z10;
            return viewState.a(rateAndReviewDecorator, eVar, z11, cameraPermissionToast, bVar2);
        }

        public final ViewState a(RateAndReviewDecorator rateAndReviewDecorator, e modalState, boolean isLoading, CameraPermissionToast cameraPermissionNeededToast, b activeBottomSheet) {
            Intrinsics.j(rateAndReviewDecorator, "rateAndReviewDecorator");
            Intrinsics.j(modalState, "modalState");
            return new ViewState(rateAndReviewDecorator, modalState, isLoading, cameraPermissionNeededToast, activeBottomSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.rateAndReviewDecorator, viewState.rateAndReviewDecorator) && Intrinsics.e(this.modalState, viewState.modalState) && this.isLoading == viewState.isLoading && Intrinsics.e(this.cameraPermissionNeededToast, viewState.cameraPermissionNeededToast) && Intrinsics.e(this.activeBottomSheet, viewState.activeBottomSheet);
        }

        public int hashCode() {
            int iHashCode = ((((this.rateAndReviewDecorator.hashCode() * 31) + this.modalState.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
            CameraPermissionToast cameraPermissionToast = this.cameraPermissionNeededToast;
            int iHashCode2 = (iHashCode + (cameraPermissionToast == null ? 0 : cameraPermissionToast.hashCode())) * 31;
            b bVar = this.activeBottomSheet;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(rateAndReviewDecorator=" + this.rateAndReviewDecorator + ", modalState=" + this.modalState + ", isLoading=" + this.isLoading + ", cameraPermissionNeededToast=" + this.cameraPermissionNeededToast + ", activeBottomSheet=" + this.activeBottomSheet + ')';
        }

        /* renamed from: c, reason: from getter */
        public final b getActiveBottomSheet() {
            return this.activeBottomSheet;
        }

        /* renamed from: d, reason: from getter */
        public final CameraPermissionToast getCameraPermissionNeededToast() {
            return this.cameraPermissionNeededToast;
        }

        /* renamed from: e, reason: from getter */
        public final e getModalState() {
            return this.modalState;
        }

        /* renamed from: f, reason: from getter */
        public final RateAndReviewDecorator getRateAndReviewDecorator() {
            return this.rateAndReviewDecorator;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ ViewState(RateAndReviewDecorator rateAndReviewDecorator, e eVar, boolean z10, CameraPermissionToast cameraPermissionToast, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new RateAndReviewDecorator(false, null, null, null, 0, null, null, null, null, null, null, false, null, null, 16383, null) : rateAndReviewDecorator, (i10 & 2) != 0 ? e.b.f117111a : eVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : cameraPermissionToast, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewViewModel$onAction$12$1", f = "ProductRateAndReviewViewModel.kt", l = {233}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f117117a;

        /* renamed from: b, reason: collision with root package name */
        int f117118b;

        /* renamed from: c, reason: collision with root package name */
        int f117119c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f117120d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ RateAndReviewDecorator f117121e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ W f117122f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewViewModel$onAction$12$1$4$1", f = "ProductRateAndReviewViewModel.kt", l = {246}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117123a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W f117124b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(W w10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f117124b = w10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f117124b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f117123a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f117124b._eventFlow;
                    d.a aVar = d.a.f117108a;
                    this.f117123a = 1;
                    if (interfaceC16548A.emit(aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(RateAndReviewDecorator rateAndReviewDecorator, W w10, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f117121e = rateAndReviewDecorator;
            this.f117122f = w10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f117121e, this.f117122f, continuation);
            gVar.f117120d = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object value3;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f117119c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f117120d;
                    ProductReviewSubmitRequest productReviewSubmitRequest = new ProductReviewSubmitRequest(this.f117121e.getEmailInputString(), this.f117121e.getIsTermsAndConditionsChecked(), this.f117121e.getProductId(), this.f117121e.getNickNameInputString(), this.f117121e.getRateNumber(), this.f117121e.getLocationInputString(), this.f117121e.getReviewTitleInputString(), this.f117121e.getReviewInputString(), this.f117121e.getRecommendProductStatus() == EnumC12921s0.f117391b, this.f117121e.c());
                    InterfaceC16549B interfaceC16549B = this.f117122f._viewState;
                    do {
                        value3 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value3, ViewState.b((ViewState) value3, null, null, true, null, null, 27, null)));
                    W w10 = this.f117122f;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = w10.bazaarVoiceManager;
                    this.f117120d = r23;
                    this.f117117a = productReviewSubmitRequest;
                    this.f117118b = 0;
                    this.f117119c = 1;
                    i10 = r23;
                    if (gVar.b(productReviewSubmitRequest, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f117120d;
                    ResultKt.b(obj);
                    i10 = r24;
                }
                objB = Result.b(Unit.f143329a);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            W w11 = this.f117122f;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                mv.E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                InterfaceC16549B interfaceC16549B2 = w11._viewState;
                do {
                    value2 = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value2, ViewState.b((ViewState) value2, null, new e.ErrorModal(AbstractC6392a.INSTANCE.d(Lp.c.f19396m0, new Object[0])), false, null, null, 25, null)));
            }
            W w12 = this.f117122f;
            if (Result.h(objB)) {
                C15809k.d(androidx.view.d0.a(w12), null, null, new a(w12, null), 3, null);
            }
            InterfaceC16549B interfaceC16549B3 = this.f117122f._viewState;
            do {
                value = interfaceC16549B3.getValue();
            } while (!interfaceC16549B3.e(value, ViewState.b((ViewState) value, null, null, false, null, null, 27, null)));
            return Unit.f143329a;
        }
    }

    public W(Kp.g bazaarVoiceManager) {
        Intrinsics.j(bazaarVoiceManager, "bazaarVoiceManager");
        this.bazaarVoiceManager = bazaarVoiceManager;
        InterfaceC16549B<ViewState> interfaceC16549BA = pv.S.a(new ViewState(null, null, false, null, null, 15, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<d> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC16548AB;
        this.eventFlow = C16563h.b(interfaceC16548AB);
    }

    public final InterfaceC16553F<d> p() {
        return this.eventFlow;
    }

    public final pv.P<ViewState> q() {
        return this.viewState;
    }

    public final void r(a action) {
        ViewState value;
        ViewState viewState;
        RateAndReviewDecorator rateAndReviewDecorator;
        ViewState value2;
        ViewState value3;
        ViewState viewState2;
        RateAndReviewDecorator rateAndReviewDecorator2;
        ViewState value4;
        ViewState viewState3;
        CameraPermissionToast cameraPermissionNeededToast;
        ViewState value5;
        ViewState value6;
        ViewState value7;
        ViewState viewStateB;
        ViewState value8;
        ViewState viewState4;
        EnumC12921s0 enumC12921s0;
        RateAndReviewDecorator rateAndReviewDecorator3;
        ViewState value9;
        ViewState viewState5;
        RateAndReviewDecorator rateAndReviewDecorator4;
        ViewState value10;
        ViewState viewState6;
        RateAndReviewDecorator rateAndReviewDecorator5;
        ViewState value11;
        ViewState viewState7;
        RateAndReviewDecorator rateAndReviewDecorator6;
        ViewState value12;
        ViewState viewState8;
        RateAndReviewDecorator rateAndReviewDecorator7;
        ViewState value13;
        ViewState viewState9;
        RateAndReviewDecorator rateAndReviewDecorator8;
        ViewState value14;
        ViewState viewState10;
        RateAndReviewDecorator rateAndReviewDecorator9;
        ViewState value15;
        ViewState viewState11;
        RateAndReviewDecorator rateAndReviewDecorator10;
        ViewState value16;
        ViewState viewState12;
        RateAndReviewDecorator rateAndReviewDecorator11;
        ViewState value17;
        ViewState viewState13;
        RateAndReviewDecorator rateAndReviewDecorator12;
        Intrinsics.j(action, "action");
        if (action instanceof a.p) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value17 = interfaceC16549B.getValue();
                viewState13 = value17;
                rateAndReviewDecorator12 = viewState13.getRateAndReviewDecorator();
            } while (!interfaceC16549B.e(value17, ViewState.b(viewState13, rateAndReviewDecorator12.a((16382 & 1) != 0 ? rateAndReviewDecorator12.shouldShowAllErrorStateAfterClickSubmit : true, (16382 & 2) != 0 ? rateAndReviewDecorator12.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator12.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator12.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator12.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator12.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator12.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator12.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator12.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator12.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator12.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator12.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator12.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator12.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.SetProductInfo) {
            ProductInfoForReviewSubmit productInfo = ((a.SetProductInfo) action).getProductInfo();
            if (productInfo != null) {
                InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
                do {
                    value16 = interfaceC16549B2.getValue();
                    viewState12 = value16;
                    rateAndReviewDecorator11 = viewState12.getRateAndReviewDecorator();
                } while (!interfaceC16549B2.e(value16, ViewState.b(viewState12, rateAndReviewDecorator11.a((16382 & 1) != 0 ? rateAndReviewDecorator11.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator11.productId : productInfo.getProductId(), (16382 & 4) != 0 ? rateAndReviewDecorator11.productImage : productInfo.getProductImage(), (16382 & 8) != 0 ? rateAndReviewDecorator11.productName : productInfo.getProductName(), (16382 & 16) != 0 ? rateAndReviewDecorator11.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator11.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator11.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator11.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator11.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator11.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator11.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator11.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator11.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator11.selectingPhotos : null), null, false, null, null, 30, null)));
                return;
            }
            return;
        }
        if (action instanceof a.UpdateRateNumber) {
            InterfaceC16549B<ViewState> interfaceC16549B3 = this._viewState;
            do {
                value15 = interfaceC16549B3.getValue();
                viewState11 = value15;
                rateAndReviewDecorator10 = viewState11.getRateAndReviewDecorator();
            } while (!interfaceC16549B3.e(value15, ViewState.b(viewState11, rateAndReviewDecorator10.a((16382 & 1) != 0 ? rateAndReviewDecorator10.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator10.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator10.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator10.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator10.rateNumber : ((a.UpdateRateNumber) action).getRateNumber(), (16382 & 32) != 0 ? rateAndReviewDecorator10.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator10.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator10.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator10.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator10.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator10.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator10.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator10.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator10.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.UpdateReviewInputString) {
            InterfaceC16549B<ViewState> interfaceC16549B4 = this._viewState;
            do {
                value14 = interfaceC16549B4.getValue();
                viewState10 = value14;
                rateAndReviewDecorator9 = viewState10.getRateAndReviewDecorator();
            } while (!interfaceC16549B4.e(value14, ViewState.b(viewState10, rateAndReviewDecorator9.a((16382 & 1) != 0 ? rateAndReviewDecorator9.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator9.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator9.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator9.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator9.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator9.reviewInputString : ((a.UpdateReviewInputString) action).getInputString(), (16382 & 64) != 0 ? rateAndReviewDecorator9.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator9.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator9.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator9.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator9.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator9.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator9.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator9.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.UpdateReviewTitleInputString) {
            InterfaceC16549B<ViewState> interfaceC16549B5 = this._viewState;
            do {
                value13 = interfaceC16549B5.getValue();
                viewState9 = value13;
                rateAndReviewDecorator8 = viewState9.getRateAndReviewDecorator();
            } while (!interfaceC16549B5.e(value13, ViewState.b(viewState9, rateAndReviewDecorator8.a((16382 & 1) != 0 ? rateAndReviewDecorator8.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator8.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator8.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator8.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator8.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator8.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator8.reviewTitleInputString : ((a.UpdateReviewTitleInputString) action).getInputString(), (16382 & 128) != 0 ? rateAndReviewDecorator8.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator8.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator8.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator8.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator8.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator8.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator8.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.UpdateNameInputString) {
            InterfaceC16549B<ViewState> interfaceC16549B6 = this._viewState;
            do {
                value12 = interfaceC16549B6.getValue();
                viewState8 = value12;
                rateAndReviewDecorator7 = viewState8.getRateAndReviewDecorator();
            } while (!interfaceC16549B6.e(value12, ViewState.b(viewState8, rateAndReviewDecorator7.a((16382 & 1) != 0 ? rateAndReviewDecorator7.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator7.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator7.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator7.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator7.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator7.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator7.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator7.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator7.nickNameInputString : ((a.UpdateNameInputString) action).getInputString(), (16382 & 512) != 0 ? rateAndReviewDecorator7.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator7.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator7.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator7.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator7.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.UpdateEmailInputString) {
            InterfaceC16549B<ViewState> interfaceC16549B7 = this._viewState;
            do {
                value11 = interfaceC16549B7.getValue();
                viewState7 = value11;
                rateAndReviewDecorator6 = viewState7.getRateAndReviewDecorator();
            } while (!interfaceC16549B7.e(value11, ViewState.b(viewState7, rateAndReviewDecorator6.a((16382 & 1) != 0 ? rateAndReviewDecorator6.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator6.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator6.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator6.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator6.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator6.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator6.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator6.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator6.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator6.emailInputString : ((a.UpdateEmailInputString) action).getInputString(), (16382 & 1024) != 0 ? rateAndReviewDecorator6.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator6.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator6.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator6.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.UpdateLocationInputString) {
            InterfaceC16549B<ViewState> interfaceC16549B8 = this._viewState;
            do {
                value10 = interfaceC16549B8.getValue();
                viewState6 = value10;
                rateAndReviewDecorator5 = viewState6.getRateAndReviewDecorator();
            } while (!interfaceC16549B8.e(value10, ViewState.b(viewState6, rateAndReviewDecorator5.a((16382 & 1) != 0 ? rateAndReviewDecorator5.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator5.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator5.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator5.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator5.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator5.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator5.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator5.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator5.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator5.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator5.locationInputString : ((a.UpdateLocationInputString) action).getInputString(), (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator5.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator5.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator5.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.UpdateTermsCheckedStatus) {
            InterfaceC16549B<ViewState> interfaceC16549B9 = this._viewState;
            do {
                value9 = interfaceC16549B9.getValue();
                viewState5 = value9;
                rateAndReviewDecorator4 = viewState5.getRateAndReviewDecorator();
            } while (!interfaceC16549B9.e(value9, ViewState.b(viewState5, rateAndReviewDecorator4.a((16382 & 1) != 0 ? rateAndReviewDecorator4.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator4.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator4.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator4.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator4.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator4.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator4.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator4.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator4.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator4.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator4.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator4.isTermsAndConditionsChecked : ((a.UpdateTermsCheckedStatus) action).getIsChecked(), (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator4.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator4.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.OnUpdateRecommendationsStatus) {
            InterfaceC16549B<ViewState> interfaceC16549B10 = this._viewState;
            do {
                value8 = interfaceC16549B10.getValue();
                viewState4 = value8;
                int checkedIndex = ((a.OnUpdateRecommendationsStatus) action).getCheckedIndex();
                enumC12921s0 = checkedIndex != 0 ? checkedIndex != 1 ? EnumC12921s0.f117390a : EnumC12921s0.f117392c : EnumC12921s0.f117391b;
                rateAndReviewDecorator3 = viewState4.getRateAndReviewDecorator();
            } while (!interfaceC16549B10.e(value8, ViewState.b(viewState4, rateAndReviewDecorator3.a((16382 & 1) != 0 ? rateAndReviewDecorator3.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator3.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator3.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator3.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator3.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator3.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator3.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator3.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator3.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator3.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator3.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator3.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator3.recommendProductStatus : enumC12921s0, (16382 & 8192) != 0 ? rateAndReviewDecorator3.selectingPhotos : null), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.UpdatePhotoListAction) {
            InterfaceC16549B<ViewState> interfaceC16549B11 = this._viewState;
            do {
                value7 = interfaceC16549B11.getValue();
                viewStateB = value7;
                if (Intrinsics.e(viewStateB.getActiveBottomSheet(), b.c.f117104a)) {
                    a.UpdatePhotoListAction updatePhotoListAction = (a.UpdatePhotoListAction) action;
                    if (!viewStateB.getRateAndReviewDecorator().c().contains(updatePhotoListAction.getPhoto()) && !viewStateB.getRateAndReviewDecorator().r().contains(updatePhotoListAction.getPhoto())) {
                        RateAndReviewDecorator rateAndReviewDecorator13 = viewStateB.getRateAndReviewDecorator();
                        viewStateB = ViewState.b(viewStateB, rateAndReviewDecorator13.a((16382 & 1) != 0 ? rateAndReviewDecorator13.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator13.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator13.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator13.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator13.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator13.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator13.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator13.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator13.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator13.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator13.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator13.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator13.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator13.selectingPhotos : CollectionsKt.Q0(viewStateB.getRateAndReviewDecorator().r(), updatePhotoListAction.getPhoto())), null, false, null, null, 30, null);
                    }
                }
            } while (!interfaceC16549B11.e(value7, viewStateB));
            return;
        }
        if (action instanceof a.h) {
            C15809k.d(androidx.view.d0.a(this), null, null, new g(this._viewState.getValue().getRateAndReviewDecorator(), this, null), 3, null);
            return;
        }
        if (action instanceof a.b) {
            InterfaceC16549B<ViewState> interfaceC16549B12 = this._viewState;
            do {
                value6 = interfaceC16549B12.getValue();
            } while (!interfaceC16549B12.e(value6, ViewState.b(value6, null, e.b.f117111a, false, null, null, 29, null)));
            return;
        }
        if (action instanceof a.CameraPermissionDeniedAction) {
            if (((a.CameraPermissionDeniedAction) action).getShouldPromptUser()) {
                InterfaceC16549B<ViewState> interfaceC16549B13 = this._viewState;
                do {
                    value5 = interfaceC16549B13.getValue();
                } while (!interfaceC16549B13.e(value5, ViewState.b(value5, null, null, false, new CameraPermissionToast(Lp.c.f19369Y, Lp.c.f19367X, true), null, 23, null)));
                return;
            } else {
                InterfaceC16549B<ViewState> interfaceC16549B14 = this._viewState;
                do {
                    value4 = interfaceC16549B14.getValue();
                    viewState3 = value4;
                    cameraPermissionNeededToast = viewState3.getCameraPermissionNeededToast();
                } while (!interfaceC16549B14.e(value4, ViewState.b(viewState3, null, null, false, cameraPermissionNeededToast != null ? CameraPermissionToast.b(cameraPermissionNeededToast, 0, 0, false, 3, null) : null, null, 23, null)));
                return;
            }
        }
        if (action instanceof a.e) {
            InterfaceC16549B<ViewState> interfaceC16549B15 = this._viewState;
            do {
                value3 = interfaceC16549B15.getValue();
                viewState2 = value3;
                rateAndReviewDecorator2 = viewState2.getRateAndReviewDecorator();
            } while (!interfaceC16549B15.e(value3, ViewState.b(viewState2, rateAndReviewDecorator2.a((16382 & 1) != 0 ? rateAndReviewDecorator2.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator2.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator2.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator2.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator2.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator2.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator2.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator2.addedPhotos : null, (16382 & 256) != 0 ? rateAndReviewDecorator2.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator2.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator2.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator2.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator2.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator2.selectingPhotos : CollectionsKt.m()), null, false, null, null, 30, null)));
            return;
        }
        if (action instanceof a.SetActiveBottomSheetAction) {
            InterfaceC16549B<ViewState> interfaceC16549B16 = this._viewState;
            do {
                value2 = interfaceC16549B16.getValue();
            } while (!interfaceC16549B16.e(value2, ViewState.b(value2, null, null, false, null, ((a.SetActiveBottomSheetAction) action).getActiveBottomSheet(), 15, null)));
        } else {
            if (!(action instanceof a.PickSelectedPhotosAction)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<ViewState> interfaceC16549B17 = this._viewState;
            do {
                value = interfaceC16549B17.getValue();
                viewState = value;
                rateAndReviewDecorator = viewState.getRateAndReviewDecorator();
            } while (!interfaceC16549B17.e(value, ViewState.b(viewState, rateAndReviewDecorator.a((16382 & 1) != 0 ? rateAndReviewDecorator.shouldShowAllErrorStateAfterClickSubmit : false, (16382 & 2) != 0 ? rateAndReviewDecorator.productId : null, (16382 & 4) != 0 ? rateAndReviewDecorator.productImage : null, (16382 & 8) != 0 ? rateAndReviewDecorator.productName : null, (16382 & 16) != 0 ? rateAndReviewDecorator.rateNumber : 0, (16382 & 32) != 0 ? rateAndReviewDecorator.reviewInputString : null, (16382 & 64) != 0 ? rateAndReviewDecorator.reviewTitleInputString : null, (16382 & 128) != 0 ? rateAndReviewDecorator.addedPhotos : CollectionsKt.P0(viewState.getRateAndReviewDecorator().c(), ((a.PickSelectedPhotosAction) action).a()), (16382 & 256) != 0 ? rateAndReviewDecorator.nickNameInputString : null, (16382 & 512) != 0 ? rateAndReviewDecorator.emailInputString : null, (16382 & 1024) != 0 ? rateAndReviewDecorator.locationInputString : null, (16382 & RecyclerView.m.FLAG_MOVED) != 0 ? rateAndReviewDecorator.isTermsAndConditionsChecked : false, (16382 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? rateAndReviewDecorator.recommendProductStatus : null, (16382 & 8192) != 0 ? rateAndReviewDecorator.selectingPhotos : CollectionsKt.m()), null, false, null, null, 30, null)));
        }
    }
}
