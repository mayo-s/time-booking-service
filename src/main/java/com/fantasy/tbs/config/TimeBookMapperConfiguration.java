package com.fantasy.tbs.config;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import com.fantasy.tbs.domain.TimeBookDTO;
import com.fantasy.tbs.domain.TimeBooking;
import com.fantasy.tbs.service.mapper.TimeBookMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeBookMapperConfiguration implements TimeBookMapper {

  // TODO get Employee
  // TODO get Employee bookings
  // TODO define Bean

  public long calcTimeWorked(ZonedDateTime bookingIn, ZonedDateTime bookingOut ) {

    return ChronoUnit.SECONDS.between(bookingOut, bookingIn);

  }

  @Override
  public TimeBooking toTimeBooking(TimeBookDTO timeBookDTO) {
    // TODO Auto-generated method stub
    return null;
  }

}
