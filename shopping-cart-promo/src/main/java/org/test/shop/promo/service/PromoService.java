package org.test.shop.promo.service;

import org.test.shop.promo.dto.Promo;

import java.util.Collection;
import java.util.Date;

/**
 * Created by anand.shah on 6/1/2015.
 */
public interface PromoService {

    public Collection<Promo> fetchPromos(Date forDate);
}
