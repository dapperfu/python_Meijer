package com.scandit.datacapture.barcode.ar.ui.highlight;

import android.content.Context;
import com.scandit.datacapture.barcode.data.Barcode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlightProvider;", "", "highlightForBarcode", "", "context", "Landroid/content/Context;", "barcode", "Lcom/scandit/datacapture/barcode/data/Barcode;", "callback", "Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlightProvider$Callback;", "Callback", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeArHighlightProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f120390a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlightProvider$Callback;", "", "onData", "", "highlight", "Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlight;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Callback {
        void onData(BarcodeArHighlight highlight);
    }

    void highlightForBarcode(Context context, Barcode barcode, Callback callback);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlightProvider$Companion;", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f120390a = new Companion();

        private Companion() {
        }
    }
}
