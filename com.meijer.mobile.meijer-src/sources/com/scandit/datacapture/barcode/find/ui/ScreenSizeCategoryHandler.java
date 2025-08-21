package com.scandit.datacapture.barcode.find.ui;

import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategoryHandler;", "", "screenCategory", "Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategory;", "getScreenCategory", "()Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategory;", "onPreviewSizeMeasured", "", "size", "Landroid/util/Size;", "parentSize", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ScreenSizeCategoryHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f121957a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategoryHandler$Companion;", "", "Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategoryHandler;", "impl", "()Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategoryHandler;", "Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategory;", "sizeCategory", "forced", "(Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategory;)Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategoryHandler;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f121957a = new Companion();

        public final ScreenSizeCategoryHandler forced(ScreenSizeCategory sizeCategory) {
            Intrinsics.j(sizeCategory, "sizeCategory");
            return new f(sizeCategory);
        }

        public final ScreenSizeCategoryHandler impl() {
            return new h();
        }

        private Companion() {
        }
    }

    ScreenSizeCategory getScreenCategory();

    void onPreviewSizeMeasured(Size size, Size parentSize);
}
