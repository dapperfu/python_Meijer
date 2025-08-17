package com.meijer.mobile.meijer;

import Mn.A0;
import Mn.A1;
import Mn.A2;
import Mn.A3;
import Mn.C0;
import Mn.C1;
import Mn.C2;
import Mn.C3;
import Mn.C4202a0;
import Mn.C4203a1;
import Mn.C4204a2;
import Mn.C4205a3;
import Mn.C4206b;
import Mn.C4212c0;
import Mn.C4213c1;
import Mn.C4214c2;
import Mn.C4215c3;
import Mn.C4216d;
import Mn.C4222e0;
import Mn.C4223e1;
import Mn.C4224e2;
import Mn.C4225e3;
import Mn.C4226f;
import Mn.C4232g0;
import Mn.C4233g1;
import Mn.C4234g2;
import Mn.C4235g3;
import Mn.C4236h;
import Mn.C4242i0;
import Mn.C4243i1;
import Mn.C4244i2;
import Mn.C4245i3;
import Mn.C4246j;
import Mn.C4251k0;
import Mn.C4252k1;
import Mn.C4253k2;
import Mn.C4254l;
import Mn.C4259m0;
import Mn.C4260m1;
import Mn.C4261m2;
import Mn.C4262n;
import Mn.C4267o0;
import Mn.C4268o1;
import Mn.C4269o2;
import Mn.C4270p;
import Mn.C4275q0;
import Mn.C4276q1;
import Mn.C4277q2;
import Mn.C4282s0;
import Mn.C4283s1;
import Mn.C4284s2;
import Mn.C4285t;
import Mn.C4290u0;
import Mn.C4291u1;
import Mn.C4292u2;
import Mn.C4293v;
import Mn.C4298w0;
import Mn.C4299w1;
import Mn.C4300w2;
import Mn.C4301x;
import Mn.C4306y0;
import Mn.C4307y1;
import Mn.C4308y2;
import Mn.C4309z;
import Mn.E0;
import Mn.E1;
import Mn.E2;
import Mn.E3;
import Mn.G0;
import Mn.G1;
import Mn.G2;
import Mn.G3;
import Mn.I0;
import Mn.I1;
import Mn.I2;
import Mn.I3;
import Mn.K0;
import Mn.K1;
import Mn.K2;
import Mn.M0;
import Mn.M1;
import Mn.M2;
import Mn.O0;
import Mn.O1;
import Mn.O2;
import Mn.Q0;
import Mn.Q1;
import Mn.Q2;
import Mn.S0;
import Mn.S1;
import Mn.S2;
import Mn.U0;
import Mn.U1;
import Mn.U2;
import Mn.W0;
import Mn.W1;
import Mn.W2;
import Mn.Y0;
import Mn.Y1;
import Mn.Y2;
import Mn.k3;
import Mn.m3;
import Mn.o3;
import Mn.q3;
import Mn.s3;
import Mn.u3;
import Mn.w3;
import Mn.y3;
import android.util.SparseIntArray;
import android.view.View;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class DataBinderMapperImpl extends androidx.databinding.e {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f98598a;

    @Override // androidx.databinding.e
    public androidx.databinding.p c(androidx.databinding.f fVar, View[] viewArr, int i10) {
        int i11;
        if (viewArr != null && viewArr.length != 0 && (i11 = f98598a.get(i10)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i11 == 36) {
                if ("layout/app_bar_home_0".equals(tag)) {
                    return new C4290u0(fVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for app_bar_home is invalid. Received: " + tag);
            }
            if (i11 == 58) {
                if ("layout/empty_shopping_list_view_0".equals(tag)) {
                    return new C4260m1(fVar, viewArr);
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
                    return new C4235g3(fVar, viewArr);
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
        f98598a = sparseIntArray;
        sparseIntArray.put(V.f99363a, 1);
        sparseIntArray.put(V.f99366b, 2);
        sparseIntArray.put(V.f99369c, 3);
        sparseIntArray.put(V.f99372d, 4);
        sparseIntArray.put(V.f99375e, 5);
        sparseIntArray.put(V.f99378f, 6);
        sparseIntArray.put(V.f99381g, 7);
        sparseIntArray.put(V.f99384h, 8);
        sparseIntArray.put(V.f99387i, 9);
        sparseIntArray.put(V.f99390j, 10);
        sparseIntArray.put(V.f99393k, 11);
        sparseIntArray.put(V.f99396l, 12);
        sparseIntArray.put(V.f99399m, 13);
        sparseIntArray.put(V.f99402n, 14);
        sparseIntArray.put(V.f99405o, 15);
        sparseIntArray.put(V.f99408p, 16);
        sparseIntArray.put(V.f99411q, 17);
        sparseIntArray.put(V.f99414r, 18);
        sparseIntArray.put(V.f99417s, 19);
        sparseIntArray.put(V.f99420t, 20);
        sparseIntArray.put(V.f99423u, 21);
        sparseIntArray.put(V.f99426v, 22);
        sparseIntArray.put(V.f99429w, 23);
        sparseIntArray.put(V.f99432x, 24);
        sparseIntArray.put(V.f99435y, 25);
        sparseIntArray.put(V.f99437z, 26);
        sparseIntArray.put(V.f99311A, 27);
        sparseIntArray.put(V.f99313B, 28);
        sparseIntArray.put(V.f99315C, 29);
        sparseIntArray.put(V.f99317D, 30);
        sparseIntArray.put(V.f99319E, 31);
        sparseIntArray.put(V.f99321F, 32);
        sparseIntArray.put(V.f99323G, 33);
        sparseIntArray.put(V.f99327I, 34);
        sparseIntArray.put(V.f99329J, 35);
        sparseIntArray.put(V.f99331K, 36);
        sparseIntArray.put(V.f99333L, 37);
        sparseIntArray.put(V.f99335M, 38);
        sparseIntArray.put(V.f99337N, 39);
        sparseIntArray.put(V.f99339O, 40);
        sparseIntArray.put(V.f99341P, 41);
        sparseIntArray.put(V.f99343Q, 42);
        sparseIntArray.put(V.f99345R, 43);
        sparseIntArray.put(V.f99347S, 44);
        sparseIntArray.put(V.f99349T, 45);
        sparseIntArray.put(V.f99351U, 46);
        sparseIntArray.put(V.f99353V, 47);
        sparseIntArray.put(V.f99355W, 48);
        sparseIntArray.put(V.f99357X, 49);
        sparseIntArray.put(V.f99359Y, 50);
        sparseIntArray.put(V.f99361Z, 51);
        sparseIntArray.put(V.f99364a0, 52);
        sparseIntArray.put(V.f99367b0, 53);
        sparseIntArray.put(V.f99370c0, 54);
        sparseIntArray.put(V.f99373d0, 55);
        sparseIntArray.put(V.f99376e0, 56);
        sparseIntArray.put(V.f99379f0, 57);
        sparseIntArray.put(V.f99385h0, 58);
        sparseIntArray.put(V.f99388i0, 59);
        sparseIntArray.put(V.f99391j0, 60);
        sparseIntArray.put(V.f99394k0, 61);
        sparseIntArray.put(V.f99397l0, 62);
        sparseIntArray.put(V.f99400m0, 63);
        sparseIntArray.put(V.f99403n0, 64);
        sparseIntArray.put(V.f99406o0, 65);
        sparseIntArray.put(V.f99409p0, 66);
        sparseIntArray.put(V.f99412q0, 67);
        sparseIntArray.put(V.f99415r0, 68);
        sparseIntArray.put(V.f99418s0, 69);
        sparseIntArray.put(V.f99421t0, 70);
        sparseIntArray.put(V.f99424u0, 71);
        sparseIntArray.put(V.f99427v0, 72);
        sparseIntArray.put(V.f99430w0, 73);
        sparseIntArray.put(V.f99433x0, 74);
        sparseIntArray.put(V.f99436y0, 75);
        sparseIntArray.put(V.f99312A0, 76);
        sparseIntArray.put(V.f99314B0, 77);
        sparseIntArray.put(V.f99316C0, 78);
        sparseIntArray.put(V.f99318D0, 79);
        sparseIntArray.put(V.f99324G0, 80);
        sparseIntArray.put(V.f99326H0, 81);
        sparseIntArray.put(V.f99328I0, 82);
        sparseIntArray.put(V.f99330J0, 83);
        sparseIntArray.put(V.f99332K0, 84);
        sparseIntArray.put(V.f99334L0, 85);
        sparseIntArray.put(V.f99336M0, 86);
        sparseIntArray.put(V.f99338N0, 87);
        sparseIntArray.put(V.f99340O0, 88);
        sparseIntArray.put(V.f99342P0, 89);
        sparseIntArray.put(V.f99344Q0, 90);
        sparseIntArray.put(V.f99346R0, 91);
        sparseIntArray.put(V.f99348S0, 92);
        sparseIntArray.put(V.f99350T0, 93);
        sparseIntArray.put(V.f99356W0, 94);
        sparseIntArray.put(V.f99358X0, 95);
        sparseIntArray.put(V.f99360Y0, 96);
        sparseIntArray.put(V.f99362Z0, 97);
        sparseIntArray.put(V.f99365a1, 98);
        sparseIntArray.put(V.f99368b1, 99);
        sparseIntArray.put(V.f99371c1, 100);
        sparseIntArray.put(V.f99374d1, 101);
        sparseIntArray.put(V.f99377e1, 102);
        sparseIntArray.put(V.f99380f1, 103);
        sparseIntArray.put(V.f99383g1, 104);
        sparseIntArray.put(V.f99386h1, 105);
        sparseIntArray.put(V.f99389i1, 106);
        sparseIntArray.put(V.f99392j1, 107);
        sparseIntArray.put(V.f99395k1, 108);
        sparseIntArray.put(V.f99398l1, 109);
        sparseIntArray.put(V.f99401m1, 110);
        sparseIntArray.put(V.f99404n1, 111);
        sparseIntArray.put(V.f99407o1, 112);
        sparseIntArray.put(V.f99410p1, 113);
        sparseIntArray.put(V.f99413q1, 114);
        sparseIntArray.put(V.f99416r1, 115);
        sparseIntArray.put(V.f99419s1, 116);
        sparseIntArray.put(V.f99422t1, 117);
        sparseIntArray.put(V.f99425u1, 118);
        sparseIntArray.put(V.f99428v1, 119);
        sparseIntArray.put(V.f99431w1, BinsView.TOTE_HEIGHT_DP);
        sparseIntArray.put(V.f99434x1, 121);
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
        int i11 = f98598a.get(i10);
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
                    return new C4206b(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_address_search is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_barcode_0".equals(obj)) {
                    return new C4216d(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_barcode is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_cart_0".equals(obj)) {
                    return new C4226f(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_cart is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_checkout_payment_options_0".equals(obj)) {
                    return new C4236h(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_checkout_payment_options is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_checkout_update_card_0".equals(obj)) {
                    return new C4246j(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_checkout_update_card is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_coupon_0".equals(obj)) {
                    return new C4254l(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_coupon is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_coupon_feature_0".equals(obj)) {
                    return new C4262n(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_coupon_feature is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_department_tier_0".equals(obj)) {
                    return new C4270p(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_department_tier is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_edit_cart_0".equals(obj)) {
                    return new Mn.r(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_edit_cart is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_filtered_products_0".equals(obj)) {
                    return new C4285t(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_filtered_products is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_find_substitution_0".equals(obj)) {
                    return new C4293v(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_find_substitution is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_fulfillment_slots_0".equals(obj)) {
                    return new C4301x(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_fulfillment_slots is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_home_0".equals(obj)) {
                    return new C4309z(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_order_substitutions_0".equals(obj)) {
                    return new Mn.B(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_order_substitutions is invalid. Received: " + obj);
            case 15:
                if ("layout/activity_out_of_stock_0".equals(obj)) {
                    return new Mn.D(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_out_of_stock is invalid. Received: " + obj);
            case 16:
                if ("layout/activity_personalized_shopping_list_0".equals(obj)) {
                    return new Mn.F(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_personalized_shopping_list is invalid. Received: " + obj);
            case 17:
                if ("layout/activity_phone_enrollment_0".equals(obj)) {
                    return new Mn.H(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_phone_enrollment is invalid. Received: " + obj);
            case 18:
                if ("layout/activity_product_detail_0".equals(obj)) {
                    return new Mn.J(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_product_detail is invalid. Received: " + obj);
            case 19:
                if ("layout/activity_product_note_0".equals(obj)) {
                    return new Mn.L(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_product_note is invalid. Received: " + obj);
            case 20:
                if ("layout/activity_profile_enrollment_0".equals(obj)) {
                    return new Mn.N(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_profile_enrollment is invalid. Received: " + obj);
            case 21:
                if ("layout/activity_remediation_help_0".equals(obj)) {
                    return new Mn.P(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_remediation_help is invalid. Received: " + obj);
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                if ("layout/activity_scan_0".equals(obj)) {
                    return new Mn.S(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_scan is invalid. Received: " + obj);
            case 23:
                if ("layout/activity_search_product_0".equals(obj)) {
                    return new Mn.U(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_search_product is invalid. Received: " + obj);
            case 24:
                if ("layout/activity_section_walkthrough_0".equals(obj)) {
                    return new Mn.W(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_section_walkthrough is invalid. Received: " + obj);
            case 25:
                if ("layout/activity_shop_and_scan_0".equals(obj)) {
                    return new Mn.Y(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_shop_and_scan is invalid. Received: " + obj);
            case 26:
                if ("layout/activity_shopping_list_0".equals(obj)) {
                    return new C4202a0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_shopping_list is invalid. Received: " + obj);
            case 27:
                if ("layout/activity_shopping_list_favorite_list_0".equals(obj)) {
                    return new C4212c0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_shopping_list_favorite_list is invalid. Received: " + obj);
            case 28:
                if ("layout/activity_shopping_list_related_coupons_0".equals(obj)) {
                    return new C4222e0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_shopping_list_related_coupons is invalid. Received: " + obj);
            case 29:
                if ("layout/activity_special_offers_0".equals(obj)) {
                    return new C4232g0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_special_offers is invalid. Received: " + obj);
            case 30:
                if ("layout/activity_store_0".equals(obj)) {
                    return new C4242i0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_store is invalid. Received: " + obj);
            case 31:
                if ("layout/activity_store_list_0".equals(obj)) {
                    return new C4251k0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_store_list is invalid. Received: " + obj);
            case l3.f92486e /* 32 */:
                if ("layout/address_search_activity_search_bar_0".equals(obj)) {
                    return new C4259m0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for address_search_activity_search_bar is invalid. Received: " + obj);
            case 33:
                if ("layout/address_search_suggestion_item_0".equals(obj)) {
                    return new C4267o0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for address_search_suggestion_item is invalid. Received: " + obj);
            case 34:
                if ("layout/age_restriction_warning_0".equals(obj)) {
                    return new C4275q0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for age_restriction_warning is invalid. Received: " + obj);
            case 35:
                if ("layout/alcohol_restriction_message_0".equals(obj)) {
                    return new C4282s0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for alcohol_restriction_message is invalid. Received: " + obj);
            case 36:
                if ("layout/app_bar_home_0".equals(obj)) {
                    return new C4290u0(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for app_bar_home is invalid. Received: " + obj);
            case 37:
                if ("layout/cart_error_empty_screen_0".equals(obj)) {
                    return new C4298w0(fVar, view);
                }
                throw new IllegalArgumentException("The tag for cart_error_empty_screen is invalid. Received: " + obj);
            case 38:
                if ("layout/cart_order_summary_0".equals(obj)) {
                    return new C4306y0(fVar, view);
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
                    return new C4203a1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for current_selection is invalid. Received: " + obj);
            case 53:
                if ("layout/department_list_item_0".equals(obj)) {
                    return new C4213c1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for department_list_item is invalid. Received: " + obj);
            case 54:
                if ("layout/dialog_address_chooser_0".equals(obj)) {
                    return new C4223e1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_address_chooser is invalid. Received: " + obj);
            case 55:
                if ("layout/dialog_cart_product_savings_0".equals(obj)) {
                    return new C4233g1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_cart_product_savings is invalid. Received: " + obj);
            case 56:
                if ("layout/dialog_rate_and_tip_0".equals(obj)) {
                    return new C4243i1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_rate_and_tip is invalid. Received: " + obj);
            case 57:
                if ("layout/dialog_shopping_list_item_0".equals(obj)) {
                    return new C4252k1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_shopping_list_item is invalid. Received: " + obj);
            case 58:
                if ("layout/empty_shopping_list_view_0".equals(obj)) {
                    return new C4260m1(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for empty_shopping_list_view is invalid. Received: " + obj);
            case 59:
                if ("layout/fetch_data_failure_view_0".equals(obj)) {
                    return new C4268o1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fetch_data_failure_view is invalid. Received: " + obj);
            case 60:
                if ("layout/filtered_products_results_header_0".equals(obj)) {
                    return new C4276q1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for filtered_products_results_header is invalid. Received: " + obj);
            case 61:
                if ("layout/fragment_cart_bottom_sheet_dialog_0".equals(obj)) {
                    return new C4283s1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_cart_bottom_sheet_dialog is invalid. Received: " + obj);
            case 62:
                if ("layout/fragment_coupons_0".equals(obj)) {
                    return new C4291u1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coupons is invalid. Received: " + obj);
            case 63:
                if ("layout/fragment_expiry_points_0".equals(obj)) {
                    return new C4299w1(fVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_expiry_points is invalid. Received: " + obj);
            case 64:
                if ("layout/fragment_home_0".equals(obj)) {
                    return new C4307y1(fVar, view);
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
                    return new C4204a2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_page_loading is invalid. Received: " + obj);
            case 79:
                if ("layout/list_item_shopping_list_completed_header_0".equals(obj)) {
                    return new C4214c2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_shopping_list_completed_header is invalid. Received: " + obj);
            case BinsView.LABEL_WIDTH_DP /* 80 */:
                if ("layout/list_item_stores_find_0".equals(obj)) {
                    return new C4224e2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_stores_find is invalid. Received: " + obj);
            case 81:
                if ("layout/list_item_stores_new_0".equals(obj)) {
                    return new C4234g2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_item_stores_new is invalid. Received: " + obj);
            case 82:
                if ("layout/list_section_header_shopping_list_favorite_0".equals(obj)) {
                    return new C4244i2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for list_section_header_shopping_list_favorite is invalid. Received: " + obj);
            case 83:
                if ("layout/no_addresses_view_0".equals(obj)) {
                    return new C4253k2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for no_addresses_view is invalid. Received: " + obj);
            case 84:
                if ("layout/page_departments_list_0".equals(obj)) {
                    return new C4261m2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for page_departments_list is invalid. Received: " + obj);
            case 85:
                if ("layout/personalized_intro_header_0".equals(obj)) {
                    return new C4269o2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for personalized_intro_header is invalid. Received: " + obj);
            case 86:
                if ("layout/product_search_suggestion_item_0".equals(obj)) {
                    return new C4277q2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for product_search_suggestion_item is invalid. Received: " + obj);
            case 87:
                if ("layout/recent_searches_footer_0".equals(obj)) {
                    return new C4284s2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for recent_searches_footer is invalid. Received: " + obj);
            case 88:
                if ("layout/recent_searches_header_0".equals(obj)) {
                    return new C4292u2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for recent_searches_header is invalid. Received: " + obj);
            case 89:
                if ("layout/recent_searches_item_0".equals(obj)) {
                    return new C4300w2(fVar, view);
                }
                throw new IllegalArgumentException("The tag for recent_searches_item is invalid. Received: " + obj);
            case 90:
                if ("layout/save_changes_dialog_fragment_0".equals(obj)) {
                    return new C4308y2(fVar, view);
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
                    return new C4205a3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_cart_list_item is invalid. Received: " + obj);
            case 105:
                if ("layout/view_cart_product_saving_item_0".equals(obj)) {
                    return new C4215c3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_cart_product_saving_item is invalid. Received: " + obj);
            case 106:
                if ("layout/view_include_footer_button_0".equals(obj)) {
                    return new C4225e3(fVar, view);
                }
                throw new IllegalArgumentException("The tag for view_include_footer_button is invalid. Received: " + obj);
            case 107:
                if ("layout/view_mperks_barcode_0".equals(obj)) {
                    return new C4235g3(fVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_mperks_barcode is invalid. Received: " + obj);
            case 108:
                if ("layout/view_navigation_mperks_barcode_0".equals(obj)) {
                    return new C4245i3(fVar, view);
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
