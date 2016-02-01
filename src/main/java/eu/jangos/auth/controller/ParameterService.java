package eu.jangos.auth.controller;

/*
 * Copyright 2016 Talendrys.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import eu.jangos.auth.hibernate.HibernateUtil;
import eu.jangos.auth.model.Parameter1;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ParameterService is an abstraction layer providing access to Parameters stored in the database.
 * @author Warkdev
 * @version v0.1 BETA
 */
public class ParameterService {
    private static final Logger logger = LoggerFactory.getLogger(ParameterService.class);        
    
    /**
     * Returns the parameter corresponding to the asked key.
     * @param key The key to retrieve from the database.
     * @return The parameter corresponding to the parameter key in a String format or null if the key is empty/not found.
     */
    public String getParameter(String key) {
        if(key == null || key.isEmpty()){
            logger.debug("Key parameter is empty, returning null.");
            return null;
        }
        
        String value = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        value = ((Parameter1) session.createCriteria(Parameter1.class).add(Restrictions.eq("param", key)).list().get(0)).getVal();
        
        session.close();
        
        return value;
    }    
}
