package lh;

import nh.InterfaceC15946d;
import nh.InterfaceC15947e;

/* renamed from: lh.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC15508r implements InterfaceC15946d<InterfaceC15947e> {

    /* renamed from: a, reason: collision with root package name */
    protected int f149638a = 3600000;

    /* renamed from: b, reason: collision with root package name */
    protected int f149639b = 300000;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f149640c = false;

    public AbstractC15508r c(int i10) {
        if (i10 < 900000) {
            i10 = 900000;
        }
        this.f149638a = i10;
        return this;
    }

    public AbstractC15508r d(int i10) {
        if (i10 <= 300000) {
            i10 = 300000;
        }
        this.f149639b = i10;
        return this;
    }
}
