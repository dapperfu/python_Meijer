package com.google.ads.interactivemedia.v3.api;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes4.dex */
public final class AdError extends Exception {
    private final AdErrorCode zza;
    private final AdErrorType zzb;

    public enum AdErrorType {
        LOAD,
        PLAY
    }

    public AdError(AdErrorType adErrorType, int i10, String str) {
        this(adErrorType, AdErrorCode.getErrorCodeByNumber(i10), str);
    }

    public AdErrorCode getErrorCode() {
        return this.zza;
    }

    public AdErrorType getErrorType() {
        return this.zzb;
    }

    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(1010),
        VAST_TRAFFICKING_ERROR(HttpResponseStatus.SUCCESS_OK),
        VAST_LOAD_TIMEOUT(HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY),
        VAST_TOO_MANY_REDIRECTS(HttpResponseStatus.REDIRECTION_FOUND),
        VAST_NO_ADS_AFTER_WRAPPER(HttpResponseStatus.REDIRECTION_SEE_OTHER),
        VIDEO_PLAY_ERROR(HttpResponseStatus.ERROR_BAD_REQUEST),
        VAST_MEDIA_LOAD_TIMEOUT(HttpResponseStatus.ERROR_PAYMENT_REQUIRED),
        VAST_LINEAR_ASSET_MISMATCH(403),
        OVERLAY_AD_PLAYING_FAILED(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR),
        OVERLAY_AD_LOADING_FAILED(HttpResponseStatus.ERROR_BAD_GATEWAY),
        VAST_NONLINEAR_ASSET_MISMATCH(HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE),
        COMPANION_AD_LOADING_FAILED(603),
        UNKNOWN_ERROR(900),
        VAST_EMPTY_RESPONSE(1009),
        FAILED_TO_REQUEST_ADS(1005),
        VAST_ASSET_NOT_FOUND(1007),
        ADS_REQUEST_NETWORK_ERROR(1012),
        INVALID_ARGUMENTS(1101),
        PLAYLIST_NO_CONTENT_TRACKING(1205),
        UNEXPECTED_ADS_LOADED_EVENT(1206),
        ADS_PLAYER_NOT_PROVIDED(1207);

        private final int zzb;

        public int getErrorNumber() {
            return this.zzb;
        }

        AdErrorCode(int i10) {
            this.zzb = i10;
        }

        public static AdErrorCode getErrorCodeByNumber(int i10) {
            for (AdErrorCode adErrorCode : values()) {
                if (adErrorCode.getErrorNumber() == i10) {
                    return adErrorCode;
                }
            }
            if (i10 == 1204) {
                return INTERNAL_ERROR;
            }
            return UNKNOWN_ERROR;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "AdErrorCode [name: " + name() + ", number: " + this.zzb + "]";
        }
    }

    public AdError(AdErrorType adErrorType, AdErrorCode adErrorCode, String str) {
        super(str);
        this.zzb = adErrorType;
        this.zza = adErrorCode;
    }

    public int getErrorCodeNumber() {
        return this.zza.getErrorNumber();
    }

    @Override // java.lang.Throwable
    public String toString() {
        AdErrorCode adErrorCode = this.zza;
        return "AdError [errorType: " + String.valueOf(this.zzb) + ", errorCode: " + String.valueOf(adErrorCode) + ", message: " + getMessage() + "]";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }
}
