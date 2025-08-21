package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
class RecommendationStats {
    private boolean activeUser;

    @InterfaceC16127c("RKB")
    private long rkb;

    @InterfaceC16127c("RKC")
    private long rkc;

    @InterfaceC16127c("RKI")
    private long rki;

    @InterfaceC16127c("RKN")
    private long rkn;

    @InterfaceC16127c("RKP")
    private long rkp;

    @InterfaceC16127c("RKR")
    private long rkr;

    @InterfaceC16127c("RKT")
    private long rkt;

    public long getRkb() {
        return this.rkb;
    }

    public long getRkc() {
        return this.rkc;
    }

    public long getRki() {
        return this.rki;
    }

    public long getRkn() {
        return this.rkn;
    }

    public long getRkp() {
        return this.rkp;
    }

    public long getRkr() {
        return this.rkr;
    }

    public long getRkt() {
        return this.rkt;
    }

    public boolean isActiveUser() {
        return this.activeUser;
    }

    RecommendationStats() {
    }
}
