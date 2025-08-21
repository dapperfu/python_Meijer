package com.scandit.datacapture.barcode.find.capture;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindListener;", "", "onSearchPaused", "", "foundItems", "", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItem;", "onSearchStarted", "onSearchStopped", "onSessionUpdated", "session", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSession;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeFindListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onSearchPaused(BarcodeFindListener barcodeFindListener, Set<BarcodeFindItem> foundItems) {
            Intrinsics.j(foundItems, "foundItems");
        }

        public static void onSearchStarted(BarcodeFindListener barcodeFindListener) {
        }

        public static void onSearchStopped(BarcodeFindListener barcodeFindListener, Set<BarcodeFindItem> foundItems) {
            Intrinsics.j(foundItems, "foundItems");
        }

        public static void onSessionUpdated(BarcodeFindListener barcodeFindListener, BarcodeFindSession session) {
            Intrinsics.j(session, "session");
        }
    }

    void onSearchPaused(Set<BarcodeFindItem> foundItems);

    void onSearchStarted();

    void onSearchStopped(Set<BarcodeFindItem> foundItems);

    void onSessionUpdated(BarcodeFindSession session);
}
