package com.scandit.datacapture.barcode.internal.sdk.init;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.init.EmptyContentProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/init/BarcodeLibraryLoaderContentProvider;", "Lcom/scandit/datacapture/core/internal/sdk/init/EmptyContentProvider;", "()V", "onCreate", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeLibraryLoaderContentProvider extends EmptyContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            BarcodeLibraryLoader.ensureInitialized(context);
            return true;
        }
        return true;
    }
}
