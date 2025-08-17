package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeDefault;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "", "Default", "Target", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Target;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class SparkScanScanningMode {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "scanningBehavior", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "previewBehavior", "<init>", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;)V", "component1", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "component2", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "copy", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "getScanningBehavior", "b", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "getPreviewBehavior", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Default extends SparkScanScanningMode {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SparkScanScanningBehavior scanningBehavior;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SparkScanPreviewBehavior previewBehavior;

        public static /* synthetic */ Default copy$default(Default r02, SparkScanScanningBehavior sparkScanScanningBehavior, SparkScanPreviewBehavior sparkScanPreviewBehavior, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sparkScanScanningBehavior = r02.scanningBehavior;
            }
            if ((i10 & 2) != 0) {
                sparkScanPreviewBehavior = r02.previewBehavior;
            }
            return r02.copy(sparkScanScanningBehavior, sparkScanPreviewBehavior);
        }

        /* renamed from: component1, reason: from getter */
        public final SparkScanScanningBehavior getScanningBehavior() {
            return this.scanningBehavior;
        }

        /* renamed from: component2, reason: from getter */
        public final SparkScanPreviewBehavior getPreviewBehavior() {
            return this.previewBehavior;
        }

        public final Default copy(SparkScanScanningBehavior scanningBehavior, SparkScanPreviewBehavior previewBehavior) {
            Intrinsics.j(scanningBehavior, "scanningBehavior");
            Intrinsics.j(previewBehavior, "previewBehavior");
            return new Default(scanningBehavior, previewBehavior);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r52 = (Default) other;
            return this.scanningBehavior == r52.scanningBehavior && this.previewBehavior == r52.previewBehavior;
        }

        public int hashCode() {
            return this.previewBehavior.hashCode() + (this.scanningBehavior.hashCode() * 31);
        }

        public String toString() {
            return "Default(scanningBehavior=" + this.scanningBehavior + ", previewBehavior=" + this.previewBehavior + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(SparkScanScanningBehavior scanningBehavior, SparkScanPreviewBehavior previewBehavior) {
            super(null);
            Intrinsics.j(scanningBehavior, "scanningBehavior");
            Intrinsics.j(previewBehavior, "previewBehavior");
            this.scanningBehavior = scanningBehavior;
            this.previewBehavior = previewBehavior;
            NativeSparkScanScanningModeDefault.create(scanningBehavior, previewBehavior);
        }

        public final SparkScanPreviewBehavior getPreviewBehavior() {
            return this.previewBehavior;
        }

        public final SparkScanScanningBehavior getScanningBehavior() {
            return this.scanningBehavior;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Target;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "scanningBehavior", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "previewBehavior", "<init>", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;)V", "component1", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "component2", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "copy", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Target;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "getScanningBehavior", "b", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanPreviewBehavior;", "getPreviewBehavior", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Target extends SparkScanScanningMode {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SparkScanScanningBehavior scanningBehavior;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SparkScanPreviewBehavior previewBehavior;

        public static /* synthetic */ Target copy$default(Target target, SparkScanScanningBehavior sparkScanScanningBehavior, SparkScanPreviewBehavior sparkScanPreviewBehavior, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sparkScanScanningBehavior = target.scanningBehavior;
            }
            if ((i10 & 2) != 0) {
                sparkScanPreviewBehavior = target.previewBehavior;
            }
            return target.copy(sparkScanScanningBehavior, sparkScanPreviewBehavior);
        }

        /* renamed from: component1, reason: from getter */
        public final SparkScanScanningBehavior getScanningBehavior() {
            return this.scanningBehavior;
        }

        /* renamed from: component2, reason: from getter */
        public final SparkScanPreviewBehavior getPreviewBehavior() {
            return this.previewBehavior;
        }

        public final Target copy(SparkScanScanningBehavior scanningBehavior, SparkScanPreviewBehavior previewBehavior) {
            Intrinsics.j(scanningBehavior, "scanningBehavior");
            Intrinsics.j(previewBehavior, "previewBehavior");
            return new Target(scanningBehavior, previewBehavior);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Target)) {
                return false;
            }
            Target target = (Target) other;
            return this.scanningBehavior == target.scanningBehavior && this.previewBehavior == target.previewBehavior;
        }

        public int hashCode() {
            return this.previewBehavior.hashCode() + (this.scanningBehavior.hashCode() * 31);
        }

        public String toString() {
            return "Target(scanningBehavior=" + this.scanningBehavior + ", previewBehavior=" + this.previewBehavior + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Target(SparkScanScanningBehavior scanningBehavior, SparkScanPreviewBehavior previewBehavior) {
            super(null);
            Intrinsics.j(scanningBehavior, "scanningBehavior");
            Intrinsics.j(previewBehavior, "previewBehavior");
            this.scanningBehavior = scanningBehavior;
            this.previewBehavior = previewBehavior;
            NativeSparkScanScanningModeTarget.create(scanningBehavior, previewBehavior);
        }

        public final SparkScanPreviewBehavior getPreviewBehavior() {
            return this.previewBehavior;
        }

        public final SparkScanScanningBehavior getScanningBehavior() {
            return this.scanningBehavior;
        }
    }

    public SparkScanScanningMode(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
