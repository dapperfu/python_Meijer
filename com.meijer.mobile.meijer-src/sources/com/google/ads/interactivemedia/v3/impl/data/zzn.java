package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrr;

/* loaded from: classes4.dex */
final class zzn extends zzg {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final zzrm<String> mimeTypes;
    private final double playAdsAfterTime;
    private final zzrr<UiElement> uiElements;

    private zzn(int i10, zzrm<String> zzrmVar, zzrr<UiElement> zzrrVar, boolean z10, boolean z11, double d10, boolean z12, int i11) {
        this.bitrate = i10;
        this.mimeTypes = zzrmVar;
        this.uiElements = zzrrVar;
        this.enablePreloading = z10;
        this.enableFocusSkipButton = z11;
        this.playAdsAfterTime = d10;
        this.disableUi = z12;
        this.loadVideoTimeout = i11;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        zzrm<String> zzrmVar;
        zzrr<UiElement> zzrrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzg) {
            zzg zzgVar = (zzg) obj;
            if (this.bitrate == zzgVar.bitrate() && ((zzrmVar = this.mimeTypes) != null ? zzrmVar.equals(zzgVar.mimeTypes()) : zzgVar.mimeTypes() == null) && ((zzrrVar = this.uiElements) != null ? zzrrVar.equals(zzgVar.uiElements()) : zzgVar.uiElements() == null) && this.enablePreloading == zzgVar.enablePreloading() && this.enableFocusSkipButton == zzgVar.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(zzgVar.playAdsAfterTime()) && this.disableUi == zzgVar.disableUi() && this.loadVideoTimeout == zzgVar.loadVideoTimeout()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    public zzrm<String> mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    public zzrr<UiElement> uiElements() {
        return this.uiElements;
    }

    public int hashCode() {
        zzrm<String> zzrmVar = this.mimeTypes;
        int iHashCode = zzrmVar == null ? 0 : zzrmVar.hashCode();
        int i10 = this.bitrate;
        zzrr<UiElement> zzrrVar = this.uiElements;
        return ((((((((((((iHashCode ^ ((i10 ^ 1000003) * 1000003)) * 1000003) ^ (zzrrVar != null ? zzrrVar.hashCode() : 0)) * 1000003) ^ (true != this.enablePreloading ? 1237 : 1231)) * 1000003) ^ (true != this.enableFocusSkipButton ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003) ^ (true != this.disableUi ? 1237 : 1231)) * 1000003) ^ this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzg
    zzf toBuilder() {
        return new zzl(this);
    }

    public String toString() {
        zzrr<UiElement> zzrrVar = this.uiElements;
        return "AdsRenderingSettingsData{bitrate=" + this.bitrate + ", mimeTypes=" + String.valueOf(this.mimeTypes) + ", uiElements=" + String.valueOf(zzrrVar) + ", enablePreloading=" + this.enablePreloading + ", enableFocusSkipButton=" + this.enableFocusSkipButton + ", playAdsAfterTime=" + this.playAdsAfterTime + ", disableUi=" + this.disableUi + ", loadVideoTimeout=" + this.loadVideoTimeout + "}";
    }
}
