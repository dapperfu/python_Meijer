package com.meijer.mobile.meijer;

import Nn.A0;
import Nn.A1;
import Nn.A2;
import Nn.A3;
import Nn.C0;
import Nn.C1;
import Nn.C2;
import Nn.C3;
import Nn.C4207a0;
import Nn.C4208a1;
import Nn.C4209a2;
import Nn.C4210a3;
import Nn.C4211b;
import Nn.C4217c0;
import Nn.C4218c1;
import Nn.C4219c2;
import Nn.C4220c3;
import Nn.C4221d;
import Nn.C4227e0;
import Nn.C4228e1;
import Nn.C4229e2;
import Nn.C4230e3;
import Nn.C4231f;
import Nn.C4237g0;
import Nn.C4238g1;
import Nn.C4239g2;
import Nn.C4240g3;
import Nn.C4241h;
import Nn.C4247i0;
import Nn.C4248i1;
import Nn.C4249i2;
import Nn.C4250i3;
import Nn.C4251j;
import Nn.C4256k0;
import Nn.C4257k1;
import Nn.C4258k2;
import Nn.C4259l;
import Nn.C4264m0;
import Nn.C4265m1;
import Nn.C4266m2;
import Nn.C4267n;
import Nn.C4272o0;
import Nn.C4273o1;
import Nn.C4274o2;
import Nn.C4275p;
import Nn.C4280q0;
import Nn.C4281q1;
import Nn.C4282q2;
import Nn.C4287s0;
import Nn.C4288s1;
import Nn.C4289s2;
import Nn.C4290t;
import Nn.C4295u0;
import Nn.C4296u1;
import Nn.C4297u2;
import Nn.C4298v;
import Nn.C4303w0;
import Nn.C4304w1;
import Nn.C4305w2;
import Nn.C4306x;
import Nn.C4311y0;
import Nn.C4312y1;
import Nn.C4313y2;
import Nn.C4314z;
import Nn.E0;
import Nn.E1;
import Nn.E2;
import Nn.E3;
import Nn.G0;
import Nn.G1;
import Nn.G2;
import Nn.G3;
import Nn.I0;
import Nn.I1;
import Nn.I2;
import Nn.I3;
import Nn.K0;
import Nn.K1;
import Nn.K2;
import Nn.M0;
import Nn.M1;
import Nn.M2;
import Nn.O0;
import Nn.O1;
import Nn.O2;
import Nn.Q0;
import Nn.Q1;
import Nn.Q2;
import Nn.S0;
import Nn.S1;
import Nn.S2;
import Nn.U0;
import Nn.U1;
import Nn.U2;
import Nn.W0;
import Nn.W1;
import Nn.W2;
import Nn.Y0;
import Nn.Y1;
import Nn.Y2;
import Nn.k3;
import Nn.m3;
import Nn.o3;
import Nn.q3;
import Nn.s3;
import Nn.u3;
import Nn.w3;
import Nn.y3;
import android.util.SparseIntArray;
import android.view.View;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class DataBinderMapperImpl extends androidx.databinding.e {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f99456a;

    @Override // androidx.databinding.e
    public androidx.databinding.p c(androidx.databinding.f fVar, View[] viewArr, int i10) {
        int i11;
        if (viewArr != null && viewArr.length != 0 && (i11 = f99456a.get(i10)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i11 == 36) {
                if ("layout/app_bar_home_0".equals(tag)) {
                    return new C4295u0(fVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for app_bar_home is invalid. Received: " + tag);
            }
            if (i11 == 58) {
                if ("layout/empty_shopping_list_view_0".equals(tag)) {
                    return new C4265m1(fVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for empty_shopping_list_view is invalid. Received: " + tag);
            }
            if (i11 == 102) {
                if ("layout/view_add_from_favorites_0".equals(tag)) {
                    return new W2(fVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for view_add_from_favorites is invalid. Received: " + tag);
            }
            if (i11 == 107) {
                if ("layout/view_mperks_barcode_0".equals(tag)) {
                    return new C4240g3(fVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for view_mperks_barcode is invalid. Received: " + tag);
            }
            if (i11 == 109) {
                if ("layout/view_new_enrollment_phone_and_pin_entry_0".equals(tag)) {
                    return new k3(fVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for view_new_enrollment_phone_and_pin_entry is invalid. Received: " + tag);
            }
            if (i11 == 120) {
                if ("layout/view_simple_scroll_0".equals(tag)) {
                    return new G3(fVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for view_simple_scroll is invalid. Received: " + tag);
            }
            switch (i11) {
                case 97:
                    if ("layout/unauth_content_view_0".equals(tag)) {
                        return new M2(fVar, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for unauth_content_view is invalid. Received: " + tag);
                case 98:
                    if ("layout/unauth_footer_0".equals(tag)) {
                        return new O2(fVar, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for unauth_footer is invalid. Received: " + tag);
                case 99:
                    if ("layout/unauth_footer_new_homescreen_0".equals(tag)) {
                        return new Q2(fVar, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for unauth_footer_new_homescreen is invalid. Received: " + tag);
                default:
                    switch (i11) {
                        case 116:
                            if ("layout/view_settings_contact_us_footer_0".equals(tag)) {
                                return new y3(fVar, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for view_settings_contact_us_footer is invalid. Received: " + tag);
                        case 117:
                            if ("layout/view_shopping_list_0".equals(tag)) {
                                return new A3(fVar, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for view_shopping_list is invalid. Received: " + tag);
                        case 118:
                            if ("layout/view_shopping_list_favorites_0".equals(tag)) {
                                return new C3(fVar, viewArr);
                            }
                            throw new IllegalArgumentException("The tag for view_shopping_list_favorites is invalid. Received: " + tag);
                    }
            }
        }
        return null;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(121);
        f99456a = sparseIntArray;
        sparseIntArray.put(V.f100219a, 1);
        sparseIntArray.put(V.f100222b, 2);
        sparseIntArray.put(V.f100225c, 3);
        sparseIntArray.put(V.f100228d, 4);
        sparseIntArray.put(V.f100231e, 5);
        sparseIntArray.put(V.f100234f, 6);
        sparseIntArray.put(V.f100237g, 7);
        sparseIntArray.put(V.f100240h, 8);
        sparseIntArray.put(V.f100243i, 9);
        sparseIntArray.put(V.f100246j, 10);
        sparseIntArray.put(V.f100249k, 11);
        sparseIntArray.put(V.f100252l, 12);
        sparseIntArray.put(V.f100255m, 13);
        sparseIntArray.put(V.f100258n, 14);
        sparseIntArray.put(V.f100261o, 15);
        sparseIntArray.put(V.f100264p, 16);
        sparseIntArray.put(V.f100267q, 17);
        sparseIntArray.put(V.f100270r, 18);
        sparseIntArray.put(V.f100273s, 19);
        sparseIntArray.put(V.f100276t, 20);
        sparseIntArray.put(V.f100279u, 21);
        sparseIntArray.put(V.f100282v, 22);
        sparseIntArray.put(V.f100285w, 23);
        sparseIntArray.put(V.f100288x, 24);
        sparseIntArray.put(V.f100291y, 25);
        sparseIntArray.put(V.f100293z, 26);
        sparseIntArray.put(V.f100167A, 27);
        sparseIntArray.put(V.f100169B, 28);
        sparseIntArray.put(V.f100171C, 29);
        sparseIntArray.put(V.f100173D, 30);
        sparseIntArray.put(V.f100175E, 31);
        sparseIntArray.put(V.f100177F, 32);
        sparseIntArray.put(V.f100179G, 33);
        sparseIntArray.put(V.f100183I, 34);
        sparseIntArray.put(V.f100185J, 35);
        sparseIntArray.put(V.f100187K, 36);
        sparseIntArray.put(V.f100189L, 37);
        sparseIntArray.put(V.f100191M, 38);
        sparseIntArray.put(V.f100193N, 39);
        sparseIntArray.put(V.f100195O, 40);
        sparseIntArray.put(V.f100197P, 41);
        sparseIntArray.put(V.f100199Q, 42);
        sparseIntArray.put(V.f100201R, 43);
        sparseIntArray.put(V.f100203S, 44);
        sparseIntArray.put(V.f100205T, 45);
        sparseIntArray.put(V.f100207U, 46);
        sparseIntArray.put(V.f100209V, 47);
        sparseIntArray.put(V.f100211W, 48);
        sparseIntArray.put(V.f100213X, 49);
        sparseIntArray.put(V.f100215Y, 50);
        sparseIntArray.put(V.f100217Z, 51);
        sparseIntArray.put(V.f100220a0, 52);
        sparseIntArray.put(V.f100223b0, 53);
        sparseIntArray.put(V.f100226c0, 54);
        sparseIntArray.put(V.f100229d0, 55);
        sparseIntArray.put(V.f100232e0, 56);
        sparseIntArray.put(V.f100235f0, 57);
        sparseIntArray.put(V.f100241h0, 58);
        sparseIntArray.put(V.f100244i0, 59);
        sparseIntArray.put(V.f100247j0, 60);
        sparseIntArray.put(V.f100250k0, 61);
        sparseIntArray.put(V.f100253l0, 62);
        sparseIntArray.put(V.f100256m0, 63);
        sparseIntArray.put(V.f100259n0, 64);
        sparseIntArray.put(V.f100262o0, 65);
        sparseIntArray.put(V.f100265p0, 66);
        sparseIntArray.put(V.f100268q0, 67);
        sparseIntArray.put(V.f100271r0, 68);
        sparseIntArray.put(V.f100274s0, 69);
        sparseIntArray.put(V.f100277t0, 70);
        sparseIntArray.put(V.f100280u0, 71);
        sparseIntArray.put(V.f100283v0, 72);
        sparseIntArray.put(V.f100286w0, 73);
        sparseIntArray.put(V.f100289x0, 74);
        sparseIntArray.put(V.f100292y0, 75);
        sparseIntArray.put(V.f100168A0, 76);
        sparseIntArray.put(V.f100170B0, 77);
        sparseIntArray.put(V.f100172C0, 78);
        sparseIntArray.put(V.f100174D0, 79);
        sparseIntArray.put(V.f100180G0, 80);
        sparseIntArray.put(V.f100182H0, 81);
        sparseIntArray.put(V.f100184I0, 82);
        sparseIntArray.put(V.f100186J0, 83);
        sparseIntArray.put(V.f100188K0, 84);
        sparseIntArray.put(V.f100190L0, 85);
        sparseIntArray.put(V.f100192M0, 86);
        sparseIntArray.put(V.f100194N0, 87);
        sparseIntArray.put(V.f100196O0, 88);
        sparseIntArray.put(V.f100198P0, 89);
        sparseIntArray.put(V.f100200Q0, 90);
        sparseIntArray.put(V.f100202R0, 91);
        sparseIntArray.put(V.f100204S0, 92);
        sparseIntArray.put(V.f100206T0, 93);
        sparseIntArray.put(V.f100212W0, 94);
        sparseIntArray.put(V.f100214X0, 95);
        sparseIntArray.put(V.f100216Y0, 96);
        sparseIntArray.put(V.f100218Z0, 97);
        sparseIntArray.put(V.f100221a1, 98);
        sparseIntArray.put(V.f100224b1, 99);
        sparseIntArray.put(V.f100227c1, 100);
        sparseIntArray.put(V.f100230d1, 101);
        sparseIntArray.put(V.f100233e1, 102);
        sparseIntArray.put(V.f100236f1, 103);
        sparseIntArray.put(V.f100239g1, 104);
        sparseIntArray.put(V.f100242h1, 105);
        sparseIntArray.put(V.f100245i1, 106);
        sparseIntArray.put(V.f100248j1, 107);
        sparseIntArray.put(V.f100251k1, 108);
        sparseIntArray.put(V.f100254l1, 109);
        sparseIntArray.put(V.f100257m1, 110);
        sparseIntArray.put(V.f100260n1, 111);
        sparseIntArray.put(V.f100263o1, 112);
        sparseIntArray.put(V.f100266p1, 113);
        sparseIntArray.put(V.f100269q1, 114);
        sparseIntArray.put(V.f100272r1, 115);
        sparseIntArray.put(V.f100275s1, 116);
        sparseIntArray.put(V.f100278t1, 117);
        sparseIntArray.put(V.f100281u1, 118);
        sparseIntArray.put(V.f100284v1, 119);
        sparseIntArray.put(V.f100287w1, BinsView.TOTE_HEIGHT_DP);
        sparseIntArray.put(V.f100290x1, 121);
    }

    @Override // androidx.databinding.e
    public List<androidx.databinding.e> a() {
        ArrayList arrayList = new ArrayList(13);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.base.ui.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.design.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.core.i18n.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.coupon.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.legacy.databinding.viewmodel.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.mperks.ux.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.coupon.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.legacy.adapters.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.legacy.progressview.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.ui.navigation.DataBinderMapperImpl());
        arrayList.add(new com.meijer.mobile.weeklyad.DataBinderMapperImpl());
        arrayList.add(new mobile.meijer.com.target.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.e
    public androidx.databinding.p b(androidx.databinding.f fVar, View view, int i10) {
        int i11 = f99456a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i12 = (i11 - 1) / 50;
        if (i12 == 0) {
            return d(fVar, view, i11, tag);
        }
        if (i12 == 1) {
            return e(fVar, view, i11, tag);
        }
        if (i12 != 2) {
            return null;
        }
        return f(fVar, view, i11, tag);
    }

    private final androidx.databinding.p d(androidx.databinding.f fVar, View view, int i10, Object obj) {
        switch (i10) {
            case 1:
                if ("layout/activity_address_search_0".equals(obj)) {
                    return new C4211b(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_address_search is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_barcode_0".equals(obj)) {
                    return new C4221d(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_barcode is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_cart_0".equals(obj)) {
                    return new C4231f(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cart is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_checkout_payment_options_0".equals(obj)) {
                    return new C4241h(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_checkout_payment_options is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_checkout_update_card_0".equals(obj)) {
                    return new C4251j(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_checkout_update_card is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_coupon_0".equals(obj)) {
                    return new C4259l(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_coupon is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_coupon_feature_0".equals(obj)) {
                    return new C4267n(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_coupon_feature is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_department_tier_0".equals(obj)) {
                    return new C4275p(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_department_tier is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_edit_cart_0".equals(obj)) {
                    return new Nn.r(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_cart is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_filtered_products_0".equals(obj)) {
                    return new C4290t(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_filtered_products is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_find_substitution_0".equals(obj)) {
                    return new C4298v(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_find_substitution is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_fulfillment_slots_0".equals(obj)) {
                    return new C4306x(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_fulfillment_slots is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_home_0".equals(obj)) {
                    return new C4314z(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_order_substitutions_0".equals(obj)) {
                    return new Nn.B(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_order_substitutions is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_out_of_stock_0".equals(obj)) {
                    return new Nn.D(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_out_of_stock is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_personalized_shopping_list_0".equals(obj)) {
                    return new Nn.F(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_personalized_shopping_list is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_phone_enrollment_0".equals(obj)) {
                    return new Nn.H(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_phone_enrollment is invalid. Received: " + obj);
            case 18:
                if ("layout/activity_product_detail_0".equals(obj)) {
                    return new Nn.J(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_product_detail is invalid. Received: " + obj);
            case 19:
                if ("layout/activity_product_note_0".equals(obj)) {
                    return new Nn.L(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_product_note is invalid. Received: " + obj);
            case 20:
                if ("layout/activity_profile_enrollment_0".equals(obj)) {
                    return new Nn.N(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_profile_enrollment is invalid. Received: " + obj);
            case 21:
                if ("layout/activity_remediation_help_0".equals(obj)) {
                    return new Nn.P(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_remediation_help is invalid. Received: " + obj);
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                if ("layout/activity_scan_0".equals(obj)) {
                    return new Nn.S(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_scan is invalid. Received: " + obj);
            case 23:
                if ("layout/activity_search_product_0".equals(obj)) {
                    return new Nn.U(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_search_product is invalid. Received: " + obj);
            case 24:
                if ("layout/activity_section_walkthrough_0".equals(obj)) {
                    return new Nn.W(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_section_walkthrough is invalid. Received: " + obj);
            case 25:
                if ("layout/activity_shop_and_scan_0".equals(obj)) {
                    return new Nn.Y(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_shop_and_scan is invalid. Received: " + obj);
            case 26:
                if ("layout/activity_shopping_list_0".equals(obj)) {
                    return new C4207a0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_shopping_list is invalid. Received: " + obj);
            case 27:
                if ("layout/activity_shopping_list_favorite_list_0".equals(obj)) {
                    return new C4217c0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_shopping_list_favorite_list is invalid. Received: " + obj);
            case 28:
                if ("layout/activity_shopping_list_related_coupons_0".equals(obj)) {
                    return new C4227e0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_shopping_list_related_coupons is invalid. Received: " + obj);
            case 29:
                if ("layout/activity_special_offers_0".equals(obj)) {
                    return new C4237g0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_special_offers is invalid. Received: " + obj);
            case 30:
                if ("layout/activity_store_0".equals(obj)) {
                    return new C4247i0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_store is invalid. Received: " + obj);
            case 31:
                if ("layout/activity_store_list_0".equals(obj)) {
                    return new C4256k0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_store_list is invalid. Received: " + obj);
            case l3.f93325e /* 32 */:
                if ("layout/address_search_activity_search_bar_0".equals(obj)) {
                    return new C4264m0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for address_search_activity_search_bar is invalid. Received: " + obj);
            case 33:
                if ("layout/address_search_suggestion_item_0".equals(obj)) {
                    return new C4272o0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for address_search_suggestion_item is invalid. Received: " + obj);
            case 34:
                if ("layout/age_restriction_warning_0".equals(obj)) {
                    return new C4280q0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for age_restriction_warning is invalid. Received: " + obj);
            case 35:
                if ("layout/alcohol_restriction_message_0".equals(obj)) {
                    return new C4287s0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for alcohol_restriction_message is invalid. Received: " + obj);
            case 36:
                if ("layout/app_bar_home_0".equals(obj)) {
                    return new C4295u0(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for app_bar_home is invalid. Received: " + obj);
            case 37:
                if ("layout/cart_error_empty_screen_0".equals(obj)) {
                    return new C4303w0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for cart_error_empty_screen is invalid. Received: " + obj);
            case 38:
                if ("layout/cart_order_summary_0".equals(obj)) {
                    return new C4311y0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for cart_order_summary is invalid. Received: " + obj);
            case 39:
                if ("layout/check_in_vehicle_color_selection_item_0".equals(obj)) {
                    return new A0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for check_in_vehicle_color_selection_item is invalid. Received: " + obj);
            case 40:
                if ("layout/checkout_item_billing_address_0".equals(obj)) {
                    return new C0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_billing_address is invalid. Received: " + obj);
            case 41:
                if ("layout/checkout_item_card_info_0".equals(obj)) {
                    return new E0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_card_info is invalid. Received: " + obj);
            case 42:
                if ("layout/checkout_item_cart_items_0".equals(obj)) {
                    return new G0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_cart_items is invalid. Received: " + obj);
            case 43:
                if ("layout/checkout_item_contact_information_0".equals(obj)) {
                    return new I0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_contact_information is invalid. Received: " + obj);
            case 44:
                if ("layout/checkout_item_delivery_address_0".equals(obj)) {
                    return new K0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_delivery_address is invalid. Received: " + obj);
            case 45:
                if ("layout/checkout_item_delivery_note_0".equals(obj)) {
                    return new M0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_delivery_note is invalid. Received: " + obj);
            case 46:
                if ("layout/checkout_item_fulfillment_slot_0".equals(obj)) {
                    return new O0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_fulfillment_slot is invalid. Received: " + obj);
            case 47:
                if ("layout/checkout_item_pickup_person_0".equals(obj)) {
                    return new Q0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_pickup_person is invalid. Received: " + obj);
            case 48:
                if ("layout/checkout_item_pickup_store_0".equals(obj)) {
                    return new S0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_pickup_store is invalid. Received: " + obj);
            case 49:
                if ("layout/checkout_item_substitute_preference_0".equals(obj)) {
                    return new U0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_item_substitute_preference is invalid. Received: " + obj);
            case 50:
                if ("layout/checkout_section_fulfillment_details_0".equals(obj)) {
                    return new W0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_section_fulfillment_details is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final androidx.databinding.p e(androidx.databinding.f fVar, View view, int i10, Object obj) {
        switch (i10) {
            case 51:
                if ("layout/checkout_section_payment_details_0".equals(obj)) {
                    return new Y0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for checkout_section_payment_details is invalid. Received: " + obj);
            case 52:
                if ("layout/current_selection_0".equals(obj)) {
                    return new C4208a1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for current_selection is invalid. Received: " + obj);
            case 53:
                if ("layout/department_list_item_0".equals(obj)) {
                    return new C4218c1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for department_list_item is invalid. Received: " + obj);
            case 54:
                if ("layout/dialog_address_chooser_0".equals(obj)) {
                    return new C4228e1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_address_chooser is invalid. Received: " + obj);
            case 55:
                if ("layout/dialog_cart_product_savings_0".equals(obj)) {
                    return new C4238g1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_cart_product_savings is invalid. Received: " + obj);
            case 56:
                if ("layout/dialog_rate_and_tip_0".equals(obj)) {
                    return new C4248i1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_rate_and_tip is invalid. Received: " + obj);
            case 57:
                if ("layout/dialog_shopping_list_item_0".equals(obj)) {
                    return new C4257k1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_shopping_list_item is invalid. Received: " + obj);
            case 58:
                if ("layout/empty_shopping_list_view_0".equals(obj)) {
                    return new C4265m1(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for empty_shopping_list_view is invalid. Received: " + obj);
            case 59:
                if ("layout/fetch_data_failure_view_0".equals(obj)) {
                    return new C4273o1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fetch_data_failure_view is invalid. Received: " + obj);
            case 60:
                if ("layout/filtered_products_results_header_0".equals(obj)) {
                    return new C4281q1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for filtered_products_results_header is invalid. Received: " + obj);
            case 61:
                if ("layout/fragment_cart_bottom_sheet_dialog_0".equals(obj)) {
                    return new C4288s1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_cart_bottom_sheet_dialog is invalid. Received: " + obj);
            case 62:
                if ("layout/fragment_coupons_0".equals(obj)) {
                    return new C4296u1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coupons is invalid. Received: " + obj);
            case 63:
                if ("layout/fragment_expiry_points_0".equals(obj)) {
                    return new C4304w1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_expiry_points is invalid. Received: " + obj);
            case 64:
                if ("layout/fragment_home_0".equals(obj)) {
                    return new C4312y1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + obj);
            case 65:
                if ("layout/fragment_products_0".equals(obj)) {
                    return new A1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_products is invalid. Received: " + obj);
            case 66:
                if ("layout/fragment_shopping_list_authenticated_0".equals(obj)) {
                    return new C1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_shopping_list_authenticated is invalid. Received: " + obj);
            case 67:
                if ("layout/fragment_shopping_list_unauthenticated_0".equals(obj)) {
                    return new E1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_shopping_list_unauthenticated is invalid. Received: " + obj);
            case 68:
                if ("layout/fragment_suggested_product_0".equals(obj)) {
                    return new G1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_suggested_product is invalid. Received: " + obj);
            case 69:
                if ("layout/fulfillment_slot_item_0".equals(obj)) {
                    return new I1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fulfillment_slot_item is invalid. Received: " + obj);
            case 70:
                if ("layout/fulfillment_slots_day_item_0".equals(obj)) {
                    return new K1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fulfillment_slots_day_item is invalid. Received: " + obj);
            case 71:
                if ("layout/fulfillment_slots_early_delivery_item_0".equals(obj)) {
                    return new M1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fulfillment_slots_early_delivery_item is invalid. Received: " + obj);
            case 72:
                if ("layout/fulfillment_slots_header_item_0".equals(obj)) {
                    return new O1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fulfillment_slots_header_item is invalid. Received: " + obj);
            case 73:
                if ("layout/fulfillment_slots_read_only_item_0".equals(obj)) {
                    return new Q1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fulfillment_slots_read_only_item is invalid. Received: " + obj);
            case 74:
                if ("layout/gam_ad_view_0".equals(obj)) {
                    return new S1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for gam_ad_view is invalid. Received: " + obj);
            case 75:
                if ("layout/item_location_info_bottom_dialog_0".equals(obj)) {
                    return new U1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for item_location_info_bottom_dialog is invalid. Received: " + obj);
            case 76:
                if ("layout/list_item_do_not_substitute_footer_0".equals(obj)) {
                    return new W1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_do_not_substitute_footer is invalid. Received: " + obj);
            case 77:
                if ("layout/list_item_high_value_promo_offers_0".equals(obj)) {
                    return new Y1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_high_value_promo_offers is invalid. Received: " + obj);
            case 78:
                if ("layout/list_item_page_loading_0".equals(obj)) {
                    return new C4209a2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_page_loading is invalid. Received: " + obj);
            case 79:
                if ("layout/list_item_shopping_list_completed_header_0".equals(obj)) {
                    return new C4219c2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_shopping_list_completed_header is invalid. Received: " + obj);
            case BinsView.LABEL_WIDTH_DP /* 80 */:
                if ("layout/list_item_stores_find_0".equals(obj)) {
                    return new C4229e2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_stores_find is invalid. Received: " + obj);
            case 81:
                if ("layout/list_item_stores_new_0".equals(obj)) {
                    return new C4239g2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_stores_new is invalid. Received: " + obj);
            case 82:
                if ("layout/list_section_header_shopping_list_favorite_0".equals(obj)) {
                    return new C4249i2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_section_header_shopping_list_favorite is invalid. Received: " + obj);
            case 83:
                if ("layout/no_addresses_view_0".equals(obj)) {
                    return new C4258k2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for no_addresses_view is invalid. Received: " + obj);
            case 84:
                if ("layout/page_departments_list_0".equals(obj)) {
                    return new C4266m2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for page_departments_list is invalid. Received: " + obj);
            case 85:
                if ("layout/personalized_intro_header_0".equals(obj)) {
                    return new C4274o2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for personalized_intro_header is invalid. Received: " + obj);
            case 86:
                if ("layout/product_search_suggestion_item_0".equals(obj)) {
                    return new C4282q2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for product_search_suggestion_item is invalid. Received: " + obj);
            case 87:
                if ("layout/recent_searches_footer_0".equals(obj)) {
                    return new C4289s2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for recent_searches_footer is invalid. Received: " + obj);
            case 88:
                if ("layout/recent_searches_header_0".equals(obj)) {
                    return new C4297u2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for recent_searches_header is invalid. Received: " + obj);
            case 89:
                if ("layout/recent_searches_item_0".equals(obj)) {
                    return new C4305w2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for recent_searches_item is invalid. Received: " + obj);
            case 90:
                if ("layout/save_changes_dialog_fragment_0".equals(obj)) {
                    return new C4313y2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for save_changes_dialog_fragment is invalid. Received: " + obj);
            case 91:
                if ("layout/search_bar_find_0".equals(obj)) {
                    return new A2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for search_bar_find is invalid. Received: " + obj);
            case 92:
                if ("layout/shopping_list_scanner_row_0".equals(obj)) {
                    return new C2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for shopping_list_scanner_row is invalid. Received: " + obj);
            case 93:
                if ("layout/shopping_list_type_ahead_row_0".equals(obj)) {
                    return new E2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for shopping_list_type_ahead_row is invalid. Received: " + obj);
            case 94:
                if ("layout/store_list_footer_layout_0".equals(obj)) {
                    return new G2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for store_list_footer_layout is invalid. Received: " + obj);
            case 95:
                if ("layout/store_search_layout_0".equals(obj)) {
                    return new I2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for store_search_layout is invalid. Received: " + obj);
            case 96:
                if ("layout/time_slots_read_only_section_0".equals(obj)) {
                    return new K2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for time_slots_read_only_section is invalid. Received: " + obj);
            case 97:
                if ("layout/unauth_content_view_0".equals(obj)) {
                    return new M2(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for unauth_content_view is invalid. Received: " + obj);
            case 98:
                if ("layout/unauth_footer_0".equals(obj)) {
                    return new O2(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for unauth_footer is invalid. Received: " + obj);
            case 99:
                if ("layout/unauth_footer_new_homescreen_0".equals(obj)) {
                    return new Q2(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for unauth_footer_new_homescreen is invalid. Received: " + obj);
            case HttpResponseStatus.INFORMATIONAL_CONTINUE /* 100 */:
                if ("layout/view_account_menu_item_0".equals(obj)) {
                    return new S2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_account_menu_item is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final androidx.databinding.p f(androidx.databinding.f fVar, View view, int i10, Object obj) {
        switch (i10) {
            case 101:
                if ("layout/view_account_profile_header_0".equals(obj)) {
                    return new U2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_account_profile_header is invalid. Received: " + obj);
            case 102:
                if ("layout/view_add_from_favorites_0".equals(obj)) {
                    return new W2(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_add_from_favorites is invalid. Received: " + obj);
            case 103:
                if ("layout/view_cart_item_note_0".equals(obj)) {
                    return new Y2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_cart_item_note is invalid. Received: " + obj);
            case 104:
                if ("layout/view_cart_list_item_0".equals(obj)) {
                    return new C4210a3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_cart_list_item is invalid. Received: " + obj);
            case 105:
                if ("layout/view_cart_product_saving_item_0".equals(obj)) {
                    return new C4220c3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_cart_product_saving_item is invalid. Received: " + obj);
            case 106:
                if ("layout/view_include_footer_button_0".equals(obj)) {
                    return new C4230e3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_include_footer_button is invalid. Received: " + obj);
            case 107:
                if ("layout/view_mperks_barcode_0".equals(obj)) {
                    return new C4240g3(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_mperks_barcode is invalid. Received: " + obj);
            case 108:
                if ("layout/view_navigation_mperks_barcode_0".equals(obj)) {
                    return new C4250i3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_navigation_mperks_barcode is invalid. Received: " + obj);
            case 109:
                if ("layout/view_new_enrollment_phone_and_pin_entry_0".equals(obj)) {
                    return new k3(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_new_enrollment_phone_and_pin_entry is invalid. Received: " + obj);
            case 110:
                if ("layout/view_order_rating_bar_0".equals(obj)) {
                    return new m3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_order_rating_bar is invalid. Received: " + obj);
            case 111:
                if ("layout/view_out_of_stock_list_item_0".equals(obj)) {
                    return new o3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_out_of_stock_list_item is invalid. Received: " + obj);
            case 112:
                if ("layout/view_out_of_stock_list_item_with_remove_0".equals(obj)) {
                    return new q3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_out_of_stock_list_item_with_remove is invalid. Received: " + obj);
            case 113:
                if ("layout/view_product_list_item_0".equals(obj)) {
                    return new s3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_product_list_item is invalid. Received: " + obj);
            case 114:
                if ("layout/view_product_list_item_compose_0".equals(obj)) {
                    return new u3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_product_list_item_compose is invalid. Received: " + obj);
            case 115:
                if ("layout/view_progress_indicator_0".equals(obj)) {
                    return new w3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_progress_indicator is invalid. Received: " + obj);
            case 116:
                if ("layout/view_settings_contact_us_footer_0".equals(obj)) {
                    return new y3(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_settings_contact_us_footer is invalid. Received: " + obj);
            case 117:
                if ("layout/view_shopping_list_0".equals(obj)) {
                    return new A3(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_shopping_list is invalid. Received: " + obj);
            case 118:
                if ("layout/view_shopping_list_favorites_0".equals(obj)) {
                    return new C3(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_shopping_list_favorites is invalid. Received: " + obj);
            case 119:
                if ("layout/view_shopping_list_item_0".equals(obj)) {
                    return new E3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_shopping_list_item is invalid. Received: " + obj);
            case BinsView.TOTE_HEIGHT_DP /* 120 */:
                if ("layout/view_simple_scroll_0".equals(obj)) {
                    return new G3(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_simple_scroll is invalid. Received: " + obj);
            case 121:
                if ("layout/view_suggested_product_list_item_0".equals(obj)) {
                    return new I3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_suggested_product_list_item is invalid. Received: " + obj);
            default:
                return null;
        }
    }
}
