package com.google.maps.android.compose;

import androidx.compose.runtime.InterfaceC5872l0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayState;", "", "<init>", "()V", "", "clearTileCache", "LOd/F;", "<set-?>", "tileOverlay$delegate", "Landroidx/compose/runtime/l0;", "getTileOverlay$maps_compose_release", "()LOd/F;", "setTileOverlay$maps_compose_release", "(LOd/F;)V", "tileOverlay", "Companion", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TileOverlayState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: tileOverlay$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 tileOverlay;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087\u0002¨\u0006\u0006"}, d2 = {"Lcom/google/maps/android/compose/TileOverlayState$Companion;", "", "<init>", "()V", "invoke", "Lcom/google/maps/android/compose/TileOverlayState;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TileOverlayState invoke() {
            return new TileOverlayState(null);
        }
    }

    public /* synthetic */ TileOverlayState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TileOverlayState() {
        this.tileOverlay = androidx.compose.runtime.t1.e(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Od.F getTileOverlay$maps_compose_release() {
        return (Od.F) this.tileOverlay.getValue();
    }

    public final void setTileOverlay$maps_compose_release(Od.F f10) {
        this.tileOverlay.setValue(f10);
    }

    public final void clearTileCache() {
        Od.F tileOverlay$maps_compose_release = getTileOverlay$maps_compose_release();
        if (tileOverlay$maps_compose_release != null) {
            tileOverlay$maps_compose_release.a();
            return;
        }
        throw new IllegalStateException("This TileOverlayState is not used in any TileOverlay");
    }
}
