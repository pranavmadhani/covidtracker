package com.madhani.covid.tracker.controllers;

import com.madhani.covid.tracker.models.LocationStats;
import com.madhani.covid.tracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

	@Autowired
	CoronaVirusDataService coronaVirusDataService;

	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = coronaVirusDataService.getAllStats();
		int totalDeaths = allStats.stream().mapToInt(stat -> (stat.getDeaths())).sum();
		int recovered = 0; float active =0;
		
		for(int i=0; i <allStats.size(); i++)
		{
			if(!allStats.get(i).getRecovered().isEmpty())
			{
				recovered+=Integer.parseInt(allStats.get(i).getRecovered());
			}
		}
		
		
		for(int i=0; i <allStats.size(); i++)
		{
			if(!allStats.get(i).getActive().isEmpty())
			{
				recovered+=Integer.parseInt(allStats.get(i).getActive());
			}
		}
		
		
		
      
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalDeaths", totalDeaths);
		model.addAttribute("recovered", recovered);
		model.addAttribute("active", active);


			

		return "home";
	}
}
